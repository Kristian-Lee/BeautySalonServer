package com.example.beautysalon.controller;

import com.example.beautysalon.mbg.model.Reserve;
import com.example.beautysalon.mbg.model.User;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.ReserveService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.4.9  15:58
 * @description
 */
@RestController
@RequestMapping("/")
public class ReserveController {

    @Resource
    private ReserveService reserveService;

    @PostMapping("businessHours/data")
    public ResponseBody getBusinessHoursData(@RequestBody Integer stylistId) {
        return reserveService.getBusinessHours(stylistId);
    }

    @PostMapping("reserve")
    public ResponseBody reserve(@RequestBody HashMap<String, Object> map) {
        return reserveService.reserve(map);
    }

    @PostMapping("cancel/reserve")
    public ResponseBody cancelReserve(@RequestBody Integer id) throws ParseException {
        return reserveService.cancelReserve(id);
    }

    @PostMapping("pay")
    public ResponseBody pay(@RequestBody Reserve reserve) throws ParseException {
        return reserveService.pay(reserve);
    }
    @PostMapping("reservation/data")
    public ResponseBody getReservationData(@RequestBody User user, @RequestHeader("type") String type) throws ParseException {
        return reserveService.getReservationData(user, type);
    }
    @PostMapping("valid/points/coupon")
    public ResponseBody getValidPointsCoupon(@RequestBody String map) {
        return reserveService.getValidPointsCoupon(map);
    }
}
