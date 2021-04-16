package com.example.beautysalon.controller;

import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.model.Stylist;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.service.RedisService;
import com.example.beautysalon.service.StylistService;
import com.example.beautysalon.util.CommonUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.3.24  13:40
 * @description
 */

@RestController
@RequestMapping("/")
public class StylistController {

    @Resource
    private StylistService stylistService;
    @Resource
    private RedisService redisService;

    @PostMapping("signUp/stylist")
    public ResponseBody insertStylist(@RequestBody Stylist stylist) {
        if (stylistService.existAccount(stylist)) {
            return new ResponseBody(ResponseCode.USER_EXIST_FAILED, "");
        }
        stylist = stylistService.insertStylist(stylist);
        String token = CommonUtil.encrypt(stylist.getStylistId() + stylist.getPassword());
        HashMap<String, Object> map = new HashMap<>();
        redisService.set(token, stylist.getPhone(), 86400L);
        redisService.set(stylist.getPhone(), "stylist", 86400L);
        map.put("token", token);
        map.put("stylist", JSON.toJSONString(stylist));
        return new ResponseBody(ResponseCode.SIGN_UP_SUCCESS, map);
    }

    @GetMapping("stylist/data")
    public ResponseBody getStylistData() {
        HashMap<String, Object> map = stylistService.selectMainData();
        if (map != null) {
            return new ResponseBody(ResponseCode.REQUEST_STYLIST_DATA_SUCCESS, map);
        }
        return new ResponseBody(ResponseCode.REQUEST_STYLIST_DATA_FAILED, "");
    }

    @PostMapping("stylist/reservation")
    public ResponseBody getStylistReservation(@RequestBody Stylist stylist, @RequestHeader("type") String type) throws ParseException {
        System.out.println("获取请求");
        return stylistService.getStylistReservation(stylist, type);
    }

    @PostMapping("stylist/main/data")
    public ResponseBody getStylistMainData(@RequestBody Stylist stylist) {
        return stylistService.getStylistMainData(stylist);
    }

    @PostMapping("update/stylist")
    public ResponseBody updateStylist(@RequestBody Stylist stylist, @RequestHeader("token") String token) {
        return stylistService.updateStylist(stylist, token);
    }

    @PostMapping("stylist/comment")
    public ResponseBody getUserComment(@RequestBody Stylist stylist, @RequestHeader("type") String type) {
        return stylistService.getUserComment(stylist, type);
    }

    @PostMapping("reservation/comment/data")
    public ResponseBody getReservationCommentData(@RequestBody Stylist stylist) {
        return stylistService.getReservationCommentData(stylist);
    }
}
