package com.example.beautysalon.controller.admin;

import com.example.beautysalon.mbg.model.Admin;
import com.example.beautysalon.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Lee
 * @date 2021.5.12  18:10
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminLoginController {

    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    private String toAdminLogin() {
        return "login";
    }

    @PostMapping("toLogin")
    @ResponseBody
    private int login(Admin admin) {
        return loginService.login(admin);
    }
}
