package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.TurnOverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.21  11:18
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminTurnOverController {

    @Resource
    private TurnOverService turnOverService;

    @GetMapping("/index")
    private String toAdminTurnOver() {
        return "index";
    }

    @CrossOrigin
    @GetMapping("/allTurnOver")
    @ResponseBody
    private List<Float> getAllTurnOver() {
        return turnOverService.getAllTurnOver();
    }

    @CrossOrigin
    @GetMapping("/allPassengerFlow")
    @ResponseBody
    private List<Integer> getAllPassengerFlow() {
        return turnOverService.getAllPassengerFlow();
    }


    @CrossOrigin
    @GetMapping("/Date")
    @ResponseBody
    private List<String> getDate() {
        return turnOverService.getDate();
    }
}
