package com.example.beautysalon.service;

import com.example.beautysalon.mbg.mapper.BalanceMapper;
import com.example.beautysalon.mbg.mapper.UserMapper;
import com.example.beautysalon.mbg.model.*;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.5  13:59
 * @description
 */
@Service
public class BalanceService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private BalanceMapper balanceMapper;

    public ResponseBody topUp(HashMap<String, Integer> map) {
        Integer userId = map.get("userId");
        Integer value = map.get("value");
        User user = userMapper.selectByPrimaryKey(userId);
        user.setMoney(user.getMoney() + value);
        userMapper.updateByPrimaryKey(user);
        Balance balance = new Balance();
        balance.setCreateDate(new Date());
        balance.setDescription("来自充值");
        balance.setPayments(value * 1f);
        balance.setUserId(userId);
        balance.setType(0);
        balanceMapper.insert(balance);
        System.out.println("执行完毕");
        return new ResponseBody(ResponseCode.TOP_UP_SUCCESS, "");
    }

    public ResponseBody getBalanceData(HashMap<String, Object> map) {
        int userId = (int) map.get("userId");
        String type = (String) map.get("type");
        BalanceExample balanceExample = new BalanceExample();
        balanceExample.setOrderByClause("create_date desc");
        BalanceExample.Criteria criteria = balanceExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        switch (type) {
            case "income":
                criteria.andTypeNotEqualTo(1);
                break;
            case "expense":
                criteria.andTypeEqualTo(1);
                break;
            default:
                break;
        }
        List<Balance> balanceList =  balanceMapper.selectByExample(balanceExample);
        if (balanceList != null) {
            return new ResponseBody(ResponseCode.REQUEST_BALANCE_DATA_SUCCESS, balanceList);
        }
        return new ResponseBody(ResponseCode.REQUEST_BALANCE_DATA_FAILED, "");
    }
}
