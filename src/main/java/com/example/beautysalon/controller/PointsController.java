package com.example.beautysalon.controller;

import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.PointsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.3.31  16:30
 * @description
 */

@RestController
@RequestMapping("/")
public class PointsController {

    @Resource
    private PointsService pointsService;

    @PostMapping("signIn/data")
    public ResponseBody getSignInData(@RequestBody int userId) {
        return pointsService.getSignInData(userId);
    }

    @PostMapping("receive/points")
    public ResponseBody receivePoints(@RequestBody HashMap<String, Integer> map) {
        return pointsService.receivePoints(map);
    }

    @PostMapping("/points/data")
    public ResponseBody getPointsData(@RequestBody int userId) {
        return pointsService.getPointsData(userId);
    }
}
