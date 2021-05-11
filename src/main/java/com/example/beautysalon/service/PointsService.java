package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.PointsMapper;
import com.example.beautysalon.mbg.mapper.ReserveMapper;
import com.example.beautysalon.mbg.mapper.SignInMapper;
import com.example.beautysalon.mbg.mapper.UserMapper;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author Lee
 * @date 2021.3.31  16:02
 * @description
 */
@Service
public class PointsService {

    @Resource
    private PointsMapper pointsMapper;
    @Resource
    private SignInMapper signInMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ReserveMapper reserveMapper;

    public ResponseBody getSignInData(int userId) {
        SignIn signIn = getSignInByUserId(userId);
        HashMap<String, Object> map = new HashMap<>();
        map.put("hasSignedIn", false);
        map.put("isConsecutive", false);
        if (signIn != null) {
            String lastDate = new SimpleDateFormat("yyyyMMdd").format(signIn.getLastDate());
            String nextDate = new SimpleDateFormat("yyyyMMdd").format(signIn.getLastDate().getTime() +
                    (60 * 60 * 24) * 1000);
            String date = new SimpleDateFormat("yyyyMMdd").format(new Date());

            /* 相等表示今日是连续签到 */
            if (nextDate.equals(date)) {
                map.put("isConsecutive", "true");
                map.put("days", signIn.getConsecutiveDay());
            }
            /* 相等说明今日已签到 */
            if (lastDate.equals(date)) {
                System.out.println("今日已签到");
                map.put("hasSignedIn", "true");
                map.put("isConsecutive", "true");
                map.put("days", signIn.getConsecutiveDay());
            }
            return new ResponseBody(ResponseCode.REQUEST_SIGN_IN_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_SIGN_IN_DATA_FAILED, "");

    }

    public ResponseBody receivePoints(HashMap<String, Integer> map) {
        Integer userId = map.get("userId");
        Integer days = map.get("days");
        Integer value = map.get("points");
        SignIn signIn = getSignInByUserId(userId);
        if (signIn != null) {
            signIn.setConsecutiveDay(days);
            signIn.setLastDate(new Date());
            signInMapper.updateByPrimaryKey(signIn);
        } else {
            SignIn tempSignIn = new SignIn();
            tempSignIn.setConsecutiveDay(days);
            tempSignIn.setLastDate(new Date());
            tempSignIn.setUserId(userId);
            signInMapper.insert(tempSignIn);
        }
        Points points = new Points();
        points.setCreateDate(new Date());
        points.setValue(value);
        points.setType(0);
        points.setUserId(userId);
        pointsMapper.insert(points);
        User user = userMapper.selectByPrimaryKey(userId);
        user.setPoints(user.getPoints() + value);
        userMapper.updateByPrimaryKey(user);
        return new ResponseBody(ResponseCode.RECEIVE_POINTS_SUCCESS, "");
    }

    public SignIn getSignInByUserId(int userId) {
        SignInExample signInExample = new SignInExample();
        signInExample.createCriteria().andUserIdEqualTo(userId);
        List<SignIn> signInList = signInMapper.selectByExample(signInExample);
        return signInList != null && signInList.size() > 0 ? signInList.get(0) : null;
    }

    public ResponseBody getPointsData(int userId) {
        //调正已完成的订单
        ReserveExample reserveExample1 = new ReserveExample();
        reserveExample1.createCriteria()
                .andUserIdEqualTo(userId)
                .andStatusEqualTo(1)
                .andIsRewardedEqualTo(0)
                .andServeDateLessThanOrEqualTo(new Date());
        List<Reserve> reserveList1 = reserveMapper.selectByExample(reserveExample1);
        reserveList1.forEach(reserve -> {
            Random random = new Random();
            int percent = random.nextInt(5) + 2;
            int value = (int) Math.ceil(reserve.getValue() * percent / 10);
            Points points = new Points();
            points.setCreateDate(reserve.getServeDate());
            points.setType(1);
            points.setUserId(userId);
            points.setValue(value);
            pointsMapper.insert(points);
            reserve.setIsRewarded(1);
            reserveMapper.updateByPrimaryKeySelective(reserve);
        });

        PointsExample pointsExample = new PointsExample();
        pointsExample.setOrderByClause("create_date desc");
        pointsExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Points> pointsList = pointsMapper.selectByExample(pointsExample);
        if (pointsList != null) {
            return new ResponseBody(ResponseCode.REQUEST_POINTS_DATA_SUCCESS, pointsList);
        }
        return new ResponseBody(ResponseCode.REQUEST_POINTS_DATA_FAILED, "");
    }
}
