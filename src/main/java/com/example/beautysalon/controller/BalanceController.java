package com.example.beautysalon.controller;

import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.BalanceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.4.5  13:58
 * @description
 */
@RestController
@RequestMapping("/")
public class BalanceController {

    @Resource
    private BalanceService balanceService;

    @PostMapping("topUp")
    public ResponseBody topUp(@RequestBody HashMap<String, Integer> map) {
        return balanceService.topUp(map);
    }

    @PostMapping("balance/data")
    public ResponseBody getBalanceData(@RequestBody HashMap<String, Object> map) {
        return balanceService.getBalanceData(map);
    }
}
