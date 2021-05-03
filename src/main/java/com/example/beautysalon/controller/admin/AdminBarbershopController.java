package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.BarbershopService;
import com.example.beautysalon.vo.BarbershopVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
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

    @GetMapping("/barbershop")
    public String toAdminBarbershop(){
        return "barbershop";
    }

    @CrossOrigin
    @GetMapping("/allBarbershopName")
    @ResponseBody
    public List<String> getAllBarbershopName(){
        return barbershopService.getAllBarbershopName();
    }

    @CrossOrigin
    @GetMapping("/allBarbershop")
    @ResponseBody
    public List<BarbershopVo> getAllBarbershop(@RequestParam String key, @RequestParam Integer page){
        return barbershopService.getAllBarbershop(key, page);
    }

    @CrossOrigin
    @GetMapping("/barbershopQuantities")
    @ResponseBody
    public int getBarbershopQuantities(@RequestParam String key) {
        return barbershopService.getBarbershopQuantities(key).size();
    }

    @CrossOrigin
    @PostMapping("/updateBarbershop")
    @ResponseBody
    public int updateBarbershop(BarbershopVo barbershopVo) throws ParseException {
        return barbershopService.updateBarbershop(barbershopVo);
    }

    @CrossOrigin
    @PostMapping("/addBarbershop")
    @ResponseBody
    public int addBarbershop(BarbershopVo barbershopVo) throws ParseException {
        return barbershopService.addBarbershop(barbershopVo);
    }

    @CrossOrigin
    @GetMapping("/deleteBarbershop")
    @ResponseBody
    public int deleteBarbershop(@RequestParam Integer barbershopId) throws ParseException {
        return barbershopService.deleteBarbershop(barbershopId);
    }
}
