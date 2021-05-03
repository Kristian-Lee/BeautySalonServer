package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.CouponService;
import com.example.beautysalon.vo.CouponVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * @author Lee
 * @date 2021.5.3  00:12
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminCouponController {

    @Resource
    private CouponService couponService;

    @GetMapping("/coupon")
    public String toAdminCoupon(){
        return "coupon";
    }

    @CrossOrigin
    @GetMapping("/allCoupon")
    @ResponseBody
    public List<CouponVo> getAllCoupon(@RequestParam String key, @RequestParam Integer page){
        return couponService.getAllCoupon(key, page);
    }

    @CrossOrigin
    @GetMapping("/couponQuantities")
    @ResponseBody
    public int getCouponQuantities(@RequestParam String key) {
        return couponService.getCouponQuantities(key).size();
    }

    @CrossOrigin
    @PostMapping("/addCoupon")
    @ResponseBody
    public int addCoupon(CouponVo couponVo) throws ParseException {
        return couponService.addCoupon(couponVo);
    }

    @CrossOrigin
    @GetMapping("/deleteCoupon")
    @ResponseBody
    public int deleteCoupon(@RequestParam Integer couponId){
        return couponService.deleteCoupon(couponId);
    }
}
