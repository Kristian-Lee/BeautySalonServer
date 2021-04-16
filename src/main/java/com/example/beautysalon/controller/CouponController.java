package com.example.beautysalon.controller;

import com.example.beautysalon.mbg.model.User;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.CouponService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.3.30  01:20
 * @description
 */
@RestController
@RequestMapping("/")
public class CouponController {
    @Resource
    private CouponService couponService;


    @PostMapping("coupon/distribution/data")
    public ResponseBody getCouponDistribution(@RequestBody User user) {
        return couponService.getCouponDistribution(user);
    }

    @PostMapping("receive/coupon")
    public ResponseBody receiveCoupon(@RequestBody HashMap<String, Object> map) {
        return couponService.receiveCoupon(map);
    }

    @PostMapping("coupon/data")
    public ResponseBody getCouponData(@RequestBody HashMap<String, Object> map) {
        return couponService.getCouponData(map);
    }
}
