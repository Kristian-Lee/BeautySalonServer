package com.example.beautysalon.service;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.mapper.CouponDistributionMapper;
import com.example.beautysalon.mbg.mapper.CouponMapper;
import com.example.beautysalon.mbg.mapper.UserMapper;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
}
