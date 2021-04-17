package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.ReserveService;
import com.example.beautysalon.vo.ReservationVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.17  15:42
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminReservationControllelr {

    @Resource
    private ReserveService reserveService;

    @GetMapping("/reservation")
    public String toAdminReservation(){
        return "reservation";
    }

    @CrossOrigin
    @GetMapping("/allReservation")
    @ResponseBody
    public List<ReservationVo> getAllReservation(@RequestParam String key, @RequestParam Integer page){
        return reserveService.getAllReservation(key, page);
    }

    @CrossOrigin
    @GetMapping("/reservationQuantities")
    @ResponseBody
    public int getreservationQuantities(@RequestParam String key) {
        return reserveService.getReservationQuantities(key).size();
    }

    @CrossOrigin
    @GetMapping("/deleteReservation")
    @ResponseBody
    public int deleteReservation(@RequestParam Integer reserveId) {
        return reserveService.deleteReservation(reserveId);
    }

    @CrossOrigin
    @GetMapping("/cancelReservation")
    @ResponseBody
    public int cancelReservation(@RequestParam Integer reserveId) throws ParseException {
        return reserveService.cancelReservation(reserveId);
    }
}
