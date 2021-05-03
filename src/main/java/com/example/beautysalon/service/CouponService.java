package com.example.beautysalon.service;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.mapper.CouponDistributionMapper;
import com.example.beautysalon.mbg.mapper.CouponMapper;
import com.example.beautysalon.mbg.mapper.UserMapper;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.vo.CouponVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lee
 * @date 2021.3.30  00:49
 * @description
 */
@Service
public class CouponService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private CouponMapper couponMapper;
    @Resource
    private CouponDistributionMapper couponDistributionMapper;

    public ResponseBody getCouponDistribution(User user) {
        HashMap<String, Object> map = new HashMap<>();
        CouponDistributionExample example = new CouponDistributionExample();
        example.createCriteria()
                .andValidDateToGreaterThanOrEqualTo(new Date());
        List<CouponDistribution> list = couponDistributionMapper.selectByExample(example);
        if (list != null) {
            map.put("coupon", list);
            if (list.size() > 0) {
                List<Integer> couponIdList = new ArrayList<>();
                for (CouponDistribution couponDistribution: list) {
                    couponIdList.add(couponDistribution.getId());
                }
                CouponExample couponExample = new CouponExample();
                couponExample.createCriteria()
                        .andCouponIdIn(couponIdList)
                        .andUserIdEqualTo(user.getUserId())
                        .andIsUsedEqualTo(0);
                List<Coupon> couponList = couponMapper.selectByExample(couponExample);
                if (couponList != null && couponList.size() > 0) {
                    List<Integer> userCoupon = new ArrayList<>();
                    for (Coupon coupon: couponList) {
                        userCoupon.add(coupon.getCouponId());
                    }
                    map.put("userCoupon", userCoupon);
                }
            }
            if (!map.containsKey("userCoupon")) {
                map.put("userCoupon", new ArrayList<>());
            }
            return new ResponseBody(ResponseCode.REQUEST_COUPON_DISTRIBUTION_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_COUPON_DISTRIBUTION_DATA_FAILED, "");
    }

    public ResponseBody receiveCoupon(HashMap<String, Object> map) {
        int userId = (int) map.get("userId");
        CouponDistribution couponDistribution = JSON.parseObject(map.get("coupon").toString(), CouponDistribution.class);
        couponDistribution = couponDistributionMapper.selectByPrimaryKey(couponDistribution.getId());
        if (couponDistribution.getNum() > 0) {
            couponDistribution.setNum(couponDistribution.getNum() - 1);
            couponDistributionMapper.updateByPrimaryKeySelective(couponDistribution);
            Coupon coupon = new Coupon();
            coupon.setCouponId(couponDistribution.getId());
            coupon.setValue(couponDistribution.getValue());
            coupon.setReceiveDate(new Date());
            coupon.setUserId(userId);
            coupon.setValidDateFrom(couponDistribution.getValidDateFrom());
            coupon.setValidDateTo(couponDistribution.getValidDateTo());
            coupon.setUpTo(couponDistribution.getUpTo());
            coupon.setType(couponDistribution.getType());
            coupon.setIsUsed(0);
            couponMapper.insert(coupon);
            return new ResponseBody(ResponseCode.RECEIVE_COUPON_SUCCESS, "");
        }
        return new ResponseBody(ResponseCode.RECEIVE_COUPON_FAILED, "");
    }

    public ResponseBody getCouponData(HashMap<String, Object> map) {
        int userId = (int) map.get("userId");
        String type = (String) map.get("type");
        CouponExample couponExample = new CouponExample();
        couponExample.setOrderByClause("is_used desc");
        CouponExample.Criteria criteria = couponExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        switch (type) {
            case "all":
                break;
            case "valid":
                criteria.andValidDateToGreaterThanOrEqualTo(new Date())
                        .andIsUsedEqualTo(0);
                break;
            case "used":
                criteria.andIsUsedEqualTo(1);
                break;
            case "invalid":
                criteria.andValidDateToLessThan(new Date())
                        .andIsUsedEqualTo(0);
                break;
            default:
                break;
        }
        List<Coupon> couponList =  couponMapper.selectByExample(couponExample);
        if (couponList != null) {
            return new ResponseBody(ResponseCode.REQUEST_COUPON_DATA_SUCCESS, couponList);
        }
        return new ResponseBody(ResponseCode.REQUEST_COUPON_DATA_FAILED, "");
    }

    public List<CouponVo> getAllCoupon(String key, Integer pageNum) {
        int pageSize = 5;
        List<CouponDistribution> couponDistributionList = getCouponQuantities(key);
        List<CouponVo> couponVoList = new ArrayList<>();
        couponDistributionList.forEach(couponDistribution -> {
            CouponVo couponVo = new CouponVo();
            couponVo.setCouponId(couponDistribution.getId());
            couponVo.setTotalNum(couponDistribution.getTotalNum());
            couponVo.setNum(couponDistribution.getNum());
            couponVo.setDateFrom(new SimpleDateFormat("yyyy-MM-dd").format(couponDistribution.getValidDateFrom()));
            couponVo.setDateTo(new SimpleDateFormat("yyyy-MM-dd").format(couponDistribution.getValidDateTo()));
            if (couponDistribution.getUpTo() > 0) {
                couponVo.setUpTo("满" + couponDistribution.getUpTo() + "可用");
            } else {
                couponVo.setUpTo("无门槛");
            }
            if (couponDistribution.getType() == 0) {
                couponVo.setType("满减券");
                couponVo.setValue("￥" + couponDistribution.getValue());
            } else {
                couponVo.setType("折扣券");
                couponVo.setValue(couponDistribution.getValue() + "折");
            }
            couponVoList.add(couponVo);
        });
        int end = pageNum * pageSize;
        if (end > couponVoList.size()) {
            end = couponVoList.size();
        }
        List<CouponVo> result = new ArrayList<>();
        for (int i = (pageNum - 1) * pageSize; i < end; i++) {
            result.add(couponVoList.get(i));
        }
        return result;
    }

    public List<CouponDistribution> getCouponQuantities(String key) {
        return couponDistributionMapper.selectByExample(new CouponDistributionExample());
    }

    public int addCoupon(CouponVo couponVo) throws ParseException {
        CouponDistribution couponDistribution = new CouponDistribution();
        if ("满减券".equals(couponVo.getType())) {
            couponDistribution.setType(0);
        } else {
            couponDistribution.setType(1);
        }
        couponDistribution.setValue(Integer.valueOf(couponVo.getValue()));
        couponDistribution.setUpTo(Integer.valueOf(couponVo.getUpTo()));
        couponDistribution.setTotalNum(couponVo.getTotalNum());
        couponDistribution.setNum(couponVo.getTotalNum());
        couponDistribution.setValidDateFrom(new SimpleDateFormat("yyyy-MM-dd").parse(couponVo.getDateFrom()));
        couponDistribution.setValidDateTo(new SimpleDateFormat("yyyy-MM-dd").parse(couponVo.getDateTo()));
        if (couponDistributionMapper.insert(couponDistribution) != -1) {
            return couponDistribution.getId();
        }
        return -1;
    }

    public int deleteCoupon(Integer couponId) {
        return couponDistributionMapper.deleteByPrimaryKey(couponId);
    }
}
