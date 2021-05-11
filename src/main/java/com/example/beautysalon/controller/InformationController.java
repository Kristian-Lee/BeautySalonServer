package com.example.beautysalon.controller;

import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.service.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lee
 * @date 2021.5.11  22:41
 * @description
 */
@RestController
@RequestMapping("/")
public class InformationController {
    @Resource
    private InformationService informationService;

    @GetMapping("information/data")
    private ResponseBody getInformationData() {
        return informationService.getInformationData();
    }
}
