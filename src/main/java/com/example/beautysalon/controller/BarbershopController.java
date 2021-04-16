package com.example.beautysalon.controller;

import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.service.BarbershopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.3.25  02:21
 * @description
 */
@RestController
@RequestMapping("/")
public class BarbershopController {

    @Resource
    private BarbershopService barbershopService;


    @GetMapping("barbershop/data")
    public ResponseBody getBarbershopData() {
        HashMap<String, Integer> map = barbershopService.selectBarbershopName();
        if (map != null) {
            return new ResponseBody(ResponseCode.REQUEST_BARBERSHOP_DATA_SUCCESS, map);
        } else {
            return new ResponseBody(ResponseCode.REQUEST_BARBERSHOP_DATA_FAILED, "");
        }
    }
}
