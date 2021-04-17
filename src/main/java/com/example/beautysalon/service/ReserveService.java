package com.example.beautysalon.service;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.mapper.*;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.vo.ReservationVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * @author Lee
 * @date 2021.4.9  13:27
 * @description
 */
@Service
public class ReserveService {

    @Resource
    private BusinessHoursMapper businessHoursMapper;

    @Resource
    private BarbershopMapper barbershopMapper;

    @Resource
    private StylistMapper stylistMapper;

    @Resource
    private ServicesMapper servicesMapper;

    @Resource
    private ReserveMapper reserveMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private CouponMapper couponMapper;

    @Resource
    private TurnoverMapper turnoverMapper;

    @Resource
    private BalanceMapper balanceMapper;

    @Resource
    private PointsMapper pointsMapper;


    public ResponseBody getBusinessHours(int stylistId) {

        HashMap<String, Object> map = new HashMap<>();
        Date todayStartDate = getStartDate(new Date());
        Date tomorrowStartDate = getStartDate(new Date(System.currentTimeMillis() + 86400000L));
        map.put("today", getBusinessHours(stylistId, todayStartDate));
        map.put("tomorrow", getBusinessHours(stylistId, tomorrowStartDate));
        map.put("service", getAllService());
        return new ResponseBody(ResponseCode.REQUEST_BUSINESS_HOURS_DATA_SUCCESS, map);
    }

    public List<BusinessHours> getBusinessHours(int stylistId, Date date) {
        BusinessHoursExample businessHoursExample = new BusinessHoursExample();
        businessHoursExample.setOrderByClause("date_from asc");
        businessHoursExample.createCriteria()
                .andStylistIdEqualTo(stylistId)
                .andDateFromGreaterThanOrEqualTo(date)
                .andDateFromLessThanOrEqualTo(new Date(date.getTime() + 86399000L));

        List<BusinessHours> list = businessHoursMapper.selectByExample(businessHoursExample);
        if (list == null || list.size() == 0) {

            Stylist stylist = stylistMapper.selectByPrimaryKey(stylistId);
            Barbershop barbershop = barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId());

            BusinessHours businessHours = new BusinessHours();
            Date openDate = new Date(barbershop.getOpen().getTime() + date.getTime() + 28800000L);
            Date closeDate = new Date(barbershop.getClose().getTime() + date.getTime() + 28800000L);
            businessHours.setDateFrom(openDate);
            businessHours.setDateTo(closeDate);
            businessHours.setStylistId(stylistId);
            businessHoursMapper.insertSelective(businessHours);
            list = businessHoursMapper.selectByExample(businessHoursExample);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDateTo().getTime() - list.get(i).getDateFrom().getTime() <= 7200000L) {
                System.out.println(list.get(i).getDateTo().getTime() - list.get(i).getDateFrom().getTime());
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }

    public Date getStartDate(Date date) {
        String tempDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINA);
        LocalDate parse = LocalDate.parse(tempDate, ofPattern);
        return new Date(parse.atStartOfDay().toInstant(ZoneOffset.of("+8")).toEpochMilli());
    }

    public List<Services> getAllService() {
        return servicesMapper.selectByExample(new ServicesExample());
    }

    public ResponseBody reserve(HashMap<String, Object> map) {
        Integer stylistId = (Integer) map.get("stylistId");
        Integer userId = (Integer) map.get("userId");
        Date dateFrom = new Date((long) map.get("dateFrom"));
        Date dateTo = new Date((long) map.get("dateTo"));
        System.out.println(dateFrom);
        System.out.println(dateTo);
        float total = Float.parseFloat((String) map.get("value"));
        int takeUp = Integer.parseInt((String) map.get("takeUp"));
        String services = (String) map.get("Service");
        BusinessHoursExample businessHoursExample = new BusinessHoursExample();
        businessHoursExample.createCriteria()
                .andStylistIdEqualTo(stylistId)
                .andDateFromLessThanOrEqualTo(dateFrom)
                .andDateToGreaterThanOrEqualTo(dateTo);
        List<BusinessHours> businessHoursList = businessHoursMapper.selectByExample(businessHoursExample);
        System.out.println(businessHoursList.size());
        if (businessHoursList != null && businessHoursList.size() != 0) {

            BusinessHours businessHours = businessHoursList.get(0);
            BusinessHours tempBusinessHours = new BusinessHours();

            tempBusinessHours.setStylistId(businessHours.getStylistId());
            tempBusinessHours.setDateFrom(dateTo);
            tempBusinessHours.setDateTo(businessHours.getDateTo());
            businessHoursMapper.insert(tempBusinessHours);

            businessHours.setDateTo(dateFrom);
            businessHoursMapper.updateByPrimaryKey(businessHours);

            Reserve reserve= new Reserve();
            reserve.setCreateDate(new Date());
            reserve.setStylistId(stylistId);
            reserve.setUserId(userId);
            reserve.setServeDate(dateFrom);
            reserve.setStatus(0);
            reserve.setTakeup(takeUp);
            reserve.setTotal(total);
            reserve.setValue(total);
            reserve.setServices(services);
            reserveMapper.insertSelective(reserve);

            HashMap<String, Object> tempMap = new HashMap<>();
            tempMap.put("order", reserve);

            //查询用户积分
            User user = userMapper.selectByPrimaryKey(userId);
            tempMap.put("user", user);

            if (user.getPoints() > total * 20) {
                tempMap.put("points", "true");
            } else {
                tempMap.put("points", "false");
            }

            //查用户优惠券
            CouponExample couponExample = new CouponExample();
            couponExample.createCriteria()
                    .andUserIdEqualTo(userId)
                    .andValidDateToGreaterThanOrEqualTo(new Date())
                    .andIsUsedEqualTo(0)
                    .andUpToLessThanOrEqualTo((int) total);
            List<Coupon> couponList = couponMapper.selectByExample(couponExample);

            System.out.println("可用优惠券张数：" + couponList.size());
            if (couponList.size() > 0) {
                tempMap.put("coupon", couponList);
            }
            return new ResponseBody(ResponseCode.RESERVE_SUCCESS, tempMap);
        }
        return new ResponseBody(ResponseCode.RESERVE_FAILED, "");
    }


    public ResponseBody cancelReserve(Integer id) throws ParseException {
        boolean result = false;
        Reserve reserve = reserveMapper.selectByPrimaryKey(id);
        Date dateFrom = reserve.getServeDate();
        Date dateTo = new Date(reserve.getServeDate().getTime() + reserve.getTakeup() * 60000);

        //查找能不能头接上某个服务时段
        BusinessHoursExample businessHoursExample = new BusinessHoursExample();
        businessHoursExample.createCriteria()
                .andDateToEqualTo(dateFrom)
                .andStylistIdEqualTo(reserve.getStylistId());
        List<BusinessHours> businessHoursList = businessHoursMapper.selectByExample(businessHoursExample);
        if (businessHoursList != null && businessHoursList.size() > 0) {
            businessHoursList.get(0).setDateTo(dateTo);
            dateFrom = businessHoursList.get(0).getDateFrom();
            businessHoursMapper.updateByPrimaryKeySelective(businessHoursList.get(0));
            result = true;
        }

        //查找能不能尾接上某个服务时段
        BusinessHoursExample businessHoursExample1 = new BusinessHoursExample();
        businessHoursExample1.createCriteria()
                .andDateFromEqualTo(dateTo)
                .andStylistIdEqualTo(reserve.getStylistId());
        List<BusinessHours> businessHoursList1 = businessHoursMapper.selectByExample(businessHoursExample1);
        if (businessHoursList1 != null && businessHoursList1.size() > 0) {
            businessHoursList1.get(0).setDateFrom(dateFrom);
            businessHoursMapper.updateByPrimaryKeySelective(businessHoursList1.get(0));
            if (result) {
                businessHoursMapper.deleteByPrimaryKey(businessHoursList.get(0).getId());
            }
        }

        //若已支付，退还金额、优惠券以及积分
        if (reserve.getStatus() == 1) {

            //更新用户数据
            User user = userMapper.selectByPrimaryKey(reserve.getUserId());
            user.setMoney(user.getMoney() + reserve.getValue());

            //退金额
            Balance balance = new Balance();
            Date date = new Date();
            balance.setDescription("来自预约退款");
            balance.setCreateDate(date);
            balance.setUserId(reserve.getUserId());
            balance.setPayments(reserve.getValue());
            balance.setType(2);
            balanceMapper.insert(balance);

            //退积分
            if (reserve.getPoints() != null && reserve.getPoints() > 0) {
                Points points = new Points();
                points.setValue(reserve.getPoints());
                points.setCreateDate(date);
                points.setUserId(reserve.getUserId());
                points.setType(3);
                pointsMapper.insert(points);
                user.setPoints(user.getPoints() + reserve.getPoints());
            }

            userMapper.updateByPrimaryKeySelective(user);

            System.out.println(reserve.getCoupon());
            //退优惠券
            if (reserve.getCoupon() != null && reserve.getCoupon() > 0) {
                CouponExample couponExample = new CouponExample();
                couponExample.createCriteria()
                        .andCouponIdEqualTo(reserve.getCoupon());
                List<Coupon> couponList = couponMapper.selectByExample(couponExample);
                if (couponList != null && couponList.size() > 0) {
                    //若优惠券已过期,追加一日使用期限
                    if (couponList.get(0).getValidDateTo().compareTo(date) < 0) {
                        couponList.get(0).setValidDateTo(new Date(date.getTime() + 86400000L));
                    }
                    couponList.get(0).setIsUsed(0);
                    couponMapper.updateByPrimaryKeySelective(couponList.get(0));
                }
            }

            //对应美发店减去营业额和客流
            TurnoverExample turnoverExample = new TurnoverExample();
            Stylist stylist = stylistMapper.selectByPrimaryKey(reserve.getStylistId());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date todayStart = simpleDateFormat.parse(simpleDateFormat.format(reserve.getCreateDate()));
            Date todayEnd = new Date(simpleDateFormat.parse(simpleDateFormat.format(reserve.getCreateDate())).getTime() + 8639900000L);
            turnoverExample.createCriteria()
                    .andBarbershopIdEqualTo(stylist.getBarbershopId())
                    .andCreateDateBetween(todayStart, todayEnd);
            List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
            if (turnoverList != null && turnoverList.size() > 0) {
                turnoverList.get(0).setTotal(turnoverList.get(0).getTotal() - reserve.getValue());
                turnoverList.get(0).setPerson(turnoverList.get(0).getPerson() - 1);
                turnoverMapper.updateByPrimaryKeySelective(turnoverList.get(0));
            }

        }

        reserve.setStatus(3);
        reserveMapper.updateByPrimaryKey(reserve);
        return new ResponseBody(ResponseCode.CANCEL_RESERVE_SUCCESS, "");
    }

    public ResponseBody pay(Reserve reserve) throws ParseException {
        User user = userMapper.selectByPrimaryKey(reserve.getUserId());
        Coupon coupon = null;
        Date date = new Date();

        Reserve tempReserve = reserveMapper.selectByPrimaryKey(reserve.getId());

        if (tempReserve.getStatus().equals(1)) {
            return new ResponseBody(ResponseCode.PAY_TWICE_ERROR, "");
        }


        if (reserve.getValue() > user.getMoney()) {
            return new ResponseBody(ResponseCode.PAY_FAILED, "");
        }

        if (reserve.getCoupon() != null && reserve.getCoupon() > 0) {
            CouponExample couponExample = new CouponExample();
            couponExample.createCriteria()
                    .andCouponIdEqualTo(reserve.getCoupon());
            List<Coupon> couponList = couponMapper.selectByExample(couponExample);
            coupon = couponList.get(0);
            if (date.compareTo(coupon.getValidDateTo()) > 0) {
                return new ResponseBody(ResponseCode.PAY_FAILED, "");
            } else {
                coupon.setIsUsed(1);
                coupon.setUsedDate(date);
            }
        }

        if (reserve.getPoints() != null && reserve.getPoints() > 0) {
            if (reserve.getPoints() > user.getPoints()) {
                return new ResponseBody(ResponseCode.PAY_FAILED, "");
            } else {
                user.setPoints(user.getPoints() - reserve.getPoints());
            }
        }


        //修改用户数据
        user.setMoney(user.getMoney() - reserve.getValue());
        userMapper.updateByPrimaryKeySelective(user);
        if (coupon != null) {
            couponMapper.updateByPrimaryKeySelective(coupon);
        }
        Balance balance = new Balance();
        balance.setUserId(user.getUserId());
        balance.setType(1);
        balance.setDescription("来自预约支付");
        balance.setCreateDate(date);
        balance.setPayments(reserve.getValue() * -1);
        balanceMapper.insert(balance);
        if (reserve.getPoints() != null && reserve.getPoints() > 0) {
            Points points = new Points();
            points.setUserId(user.getUserId());
            points.setValue(reserve.getPoints() * -1);
            points.setType(2);
            points.setCreateDate(date);
            pointsMapper.insert(points);
        }


        //修改预约数据
        reserve.setPayDate(date);
        reserve.setStatus(1);
        reserveMapper.updateByPrimaryKeySelective(reserve);


        //修改店家的信息
        TurnoverExample turnoverExample = new TurnoverExample();
        Stylist stylist = stylistMapper.selectByPrimaryKey(reserve.getStylistId());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date todayStart = simpleDateFormat.parse(simpleDateFormat.format(date));
        Date todayEnd = new Date(simpleDateFormat.parse(simpleDateFormat.format(date)).getTime() + 8639900000L);
        turnoverExample.createCriteria()
                .andBarbershopIdEqualTo(stylist.getBarbershopId())
                .andCreateDateBetween(todayStart, todayEnd);
        List<Turnover> turnoverList = turnoverMapper.selectByExample(turnoverExample);
        if (turnoverList != null && turnoverList.size() > 0) {
            turnoverList.get(0).setTotal(turnoverList.get(0).getTotal() + reserve.getValue());
            turnoverList.get(0).setPerson(turnoverList.get(0).getPerson() + 1);
            turnoverMapper.updateByPrimaryKeySelective(turnoverList.get(0));
        } else {
            Turnover turnover = new Turnover();
            turnover.setBarbershopId(stylist.getBarbershopId());
            turnover.setTotal(reserve.getValue());
            turnover.setPerson(1);
            turnover.setCreateDate(date);
            turnoverMapper.insert(turnover);
        }

        return new ResponseBody(ResponseCode.PAY_SUCCESS, "");
    }

    public ResponseBody getReservationData(User user, String type) throws ParseException {
        ReserveExample reserveExample = new ReserveExample();
        ReserveExample.Criteria criteria = reserveExample.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        switch (type) {
            case "unpaid":
                criteria.andStatusEqualTo(0)
                        .andServeDateGreaterThan(new Date());
                break;
            case "all":
                criteria.andStatusNotEqualTo(0);
                break;
            case "waitForServe":
                criteria.andStatusEqualTo(1)
                        .andServeDateGreaterThan(new Date());
                break;
            case "waitForEvaluate":
                criteria.andStatusEqualTo(1)
                        .andServeDateLessThanOrEqualTo(new Date());
                break;
            case "canceled":
                criteria.andStatusEqualTo(3);
                break;
            default:
                break;
        }
        List<Reserve> reserveList = reserveMapper.selectByExample(reserveExample);
        if (type.equals("unpaid") && reserveList != null) {
            //先调正超时自动失效的订单
            List<Stylist> stylistList = new ArrayList<>();
            for (int i = 0; i < reserveList.size(); i++) {
                if (System.currentTimeMillis() - reserveList.get(i).getCreateDate().getTime() > 1800000L) {
                    cancelReserve(reserveList.get(i).getId());
                    reserveList.remove(i);
                    i--;
                } else {
                    stylistList.add(stylistMapper.selectByPrimaryKey(reserveList.get(i).getStylistId()));
                }
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("reserve", reserveList);
            map.put("stylist", stylistList);
            return new ResponseBody(ResponseCode.REQUEST_RESERVATION_DATA_SUCCESS, map);
        } else if (reserveList != null){
            List<Stylist> stylistList = new ArrayList<>();
            List<Barbershop> barbershopList = new ArrayList<>();
            for (int i = 0; i < reserveList.size(); i++) {
                Stylist stylist = stylistMapper.selectByPrimaryKey(reserveList.get(i).getStylistId());
                stylistList.add(stylist);
                barbershopList.add(barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId()));
            }
            HashMap<String, Object> map = new HashMap<>();
            map.put("reserve", reserveList);
            map.put("stylist", stylistList);
            map.put("barbershop", barbershopList);
            return new ResponseBody(ResponseCode.REQUEST_RESERVATION_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_RESERVATION_DATA_SUCCESS, "");
    }

    public ResponseBody getValidPointsCoupon(String map) {
        HashMap<String, Object> myMap = JSON.parseObject(map, HashMap.class);
        Integer userId = (Integer) myMap.get("userId");
        Reserve reserve = JSON.parseObject(myMap.get("reserve").toString(), Reserve.class);
        float total = reserve.getTotal();
        HashMap<String, Object> tempMap = new HashMap<>();
        tempMap.put("order", reserve);
        Stylist stylist = stylistMapper.selectByPrimaryKey(reserve.getStylistId());
        tempMap.put("stylist", stylist);
        tempMap.put("barbershop", barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId()));

        //查询用户积分
        User user = userMapper.selectByPrimaryKey(userId);
        tempMap.put("user", user);

        if (user.getPoints() > total * 20) {
            tempMap.put("points", "true");
        } else {
            tempMap.put("points", "false");
        }

        //查用户优惠券
        CouponExample couponExample = new CouponExample();
        couponExample.createCriteria()
                .andUserIdEqualTo(userId)
                .andValidDateToGreaterThanOrEqualTo(new Date())
                .andIsUsedEqualTo(0)
                .andUpToLessThanOrEqualTo((int) total);
        List<Coupon> couponList = couponMapper.selectByExample(couponExample);

        System.out.println("可用优惠券张数：" + couponList.size());
        if (couponList.size() > 0) {
            tempMap.put("coupon", couponList);
        }
        return new ResponseBody(ResponseCode.REQUEST_VALID_POINTS_COUPON_SUCCESS, tempMap);
    }


    public List<Reserve> getReservationQuantities(String key) {
        //按用户查找
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameLike("%" + key + "%");
        List<User> userList = userMapper.selectByExample(userExample);
        List<Integer> userIdList = new ArrayList<>();
        userList.forEach(user -> {
            userIdList.add(user.getUserId());
        });

        //按发型师查找
        StylistExample stylistExample = new StylistExample();
        stylistExample.createCriteria().andRealNameLike("%" + key + "%");
        List<Stylist> stylistList = stylistMapper.selectByExample(stylistExample);
        List<Integer> stylistIdList = new ArrayList<>();
        stylistList.forEach(stylist -> {
            stylistIdList.add(stylist.getStylistId());
        });

        //按门店
        BarbershopExample barbershopExample = new BarbershopExample();
        barbershopExample.createCriteria().andBarbershopNameLike("%" + key + "%");
        List<Barbershop> barbershopList = barbershopMapper.selectByExample(barbershopExample);
        List<Integer> barbershopIdList = new ArrayList<>();
        barbershopList.forEach(barbershop -> {
            barbershopIdList.add(barbershop.getBarbershopId());
        });
        List<Integer> stylistIdList1 = new ArrayList<>();
        if (barbershopIdList.size() > 0) {
            StylistExample stylistExample1 = new StylistExample();
            stylistExample1.createCriteria().andBarbershopIdIn(barbershopIdList);
            List<Stylist> stylistList1 = stylistMapper.selectByExample(stylistExample1);
            stylistList1.forEach(stylist -> {
                stylistIdList1.add(stylist.getStylistId());
            });
        }

        ReserveExample reserveExample = new ReserveExample();

        if (userIdList.size() > 0) {
            ReserveExample.Criteria criteria = new ReserveExample().createCriteria();
            criteria.andUserIdIn(userIdList);
            reserveExample.or(criteria);
        }
        if (stylistIdList.size() > 0) {
            ReserveExample.Criteria criteria = new ReserveExample().createCriteria();
            criteria.andStylistIdIn(stylistIdList);
            reserveExample.or(criteria);
        }
        if (barbershopIdList.size() > 0) {
            ReserveExample.Criteria criteria = new ReserveExample().createCriteria();
            criteria.andStylistIdIn(stylistIdList1);
            reserveExample.or(criteria);
        }

        return reserveMapper.selectByExample(reserveExample);
    }

    public List<ReservationVo> getAllReservation(String key, Integer pageNum) {
        int pageSize = 5;
        List<Reserve> reserveList = getReservationQuantities(key);
        Collections.reverse(reserveList);
        List<ReservationVo> reservationVoList = new ArrayList<>();
        reserveList.forEach(reserve -> {
            ReservationVo reservationVo = new ReservationVo();
            reservationVo.setReserveId(reserve.getId());
            reservationVo.setUserName(userMapper.selectByPrimaryKey(reserve.getUserId()).getUserName());
            Stylist stylist = stylistMapper.selectByPrimaryKey(reserve.getStylistId());
            reservationVo.setStylistName(stylist.getStylistName());
            reservationVo.setBarbershop(barbershopMapper.selectByPrimaryKey(stylist.getBarbershopId()).getBarbershopName());
            reservationVo.setOrigin("￥" + reserve.getTotal());
            reservationVo.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(reserve.getCreateDate()));
            reservationVo.setServeDate(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(reserve.getServeDate()));
            reservationVo.setServices(reserve.getServices());
            reservationVo.setTakeUp(reserve.getTakeup() + "分钟");
            reservationVo.setEnableCancel("");
            switch (reserve.getStatus()) {
                case 0:
                    reservationVo.setStatus("待付款");
                    break;
                case 1:
                    if (reserve.getServeDate().compareTo(new Date()) > 0) {
                        reservationVo.setEnableCancel("true");
                        reservationVo.setStatus("待服务");
                    } else {
                        reservationVo.setStatus("已完成");
                    }
                    break;
                case 3:
                    reservationVo.setStatus("已取消");
                    break;
                default:
                    break;
            }
            if (reserve.getPoints() != null && reserve.getPoints() > 0) {
                reservationVo.setPoints("- ￥" + ((float) reserve.getPoints()) / 100 );
            } else {
                reservationVo.setPoints("无");
            }

            if (reserve.getCoupon() != null && reserve.getCoupon() > 0) {
                CouponExample couponExample = new CouponExample();
                couponExample.createCriteria().andCouponIdEqualTo(reserve.getCoupon());
                Coupon coupon = couponMapper.selectByExample(couponExample).get(0);
                switch (coupon.getType()) {
                    case 0:
                        reservationVo.setCoupon("- ￥" + coupon.getValue());
                        break;
                    case 1:
                        reservationVo.setCoupon("- ￥" + ((float) reserve.getTotal()) / 5);
                        break;
                    default:
                        break;
                }
            } else {
                reservationVo.setCoupon("无");
            }
            reservationVo.setRealPay("￥" + reserve.getValue());
            if (reserve.getPayDate() != null) {
                reservationVo.setPayDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(reserve.getPayDate()));
            }

            reservationVoList.add(reservationVo);
        });
        int end = pageNum * pageSize;
        if (end > reservationVoList.size()) {
            end = reservationVoList.size();
        }
        List<ReservationVo> result = new ArrayList<>();

        for (int i = (pageNum - 1) * pageSize; i < end; i++) {
            result.add(reservationVoList.get(i));
        }
        System.out.println("共" + result.size() + "个数据");
        return result;
    }

    public int deleteReservation(Integer reserveId) {
        return reserveMapper.deleteByPrimaryKey(reserveId);
    }

    public int cancelReservation(Integer reserveId) throws ParseException {
        ResponseBody responseBody = cancelReserve(reserveId);
        if (responseBody.getCode() == ResponseCode.CANCEL_RESERVE_SUCCESS) {
            return 1;
        } else {
            return -1;
        }
    }
}
