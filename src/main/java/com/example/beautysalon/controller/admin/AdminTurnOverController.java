package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.TurnOverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
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
    private List<Float> getAllTurnOver(@RequestParam String barbershopName) throws ParseException {
        return turnOverService.getAllTurnOver(barbershopName);
    }

    @CrossOrigin
    @GetMapping("/allPassengerFlow")
    @ResponseBody
    private List<Integer> getAllPassengerFlow(@RequestParam String barbershopName) throws ParseException {
        return turnOverService.getAllPassengerFlow(barbershopName);
    }


    @CrossOrigin
    @GetMapping("/Date")
    @ResponseBody
    private List<String> getDate(@RequestParam String barbershopName) throws ParseException {
        System.out.println(barbershopName);
        return turnOverService.getDate(barbershopName);
    }
}
