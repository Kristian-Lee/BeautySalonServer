package com.example.beautysalon.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lee
 * @date 2021.5.3  00:10
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminInformationController {


    @GetMapping("/information")
    public String toAdminInformation(){
        return "information";
    }
}
