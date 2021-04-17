package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.BarbershopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.17  11:26
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminBarbershopController {

    @Resource
    private BarbershopService barbershopService;


    @CrossOrigin
    @GetMapping("/allBarbershop")
    @ResponseBody
    public List<String> getAllBarbershopName(){
        return barbershopService.getAllBarbershopName();
    }
}
