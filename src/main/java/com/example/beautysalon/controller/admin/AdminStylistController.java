package com.example.beautysalon.controller.admin;

import com.example.beautysalon.service.StylistService;
import com.example.beautysalon.vo.StylistVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.17  02:09
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminStylistController {

    @Resource
    private StylistService stylistService;

    @GetMapping("/stylist")
    public String toAdminStylist(){
        return "stylist";
    }

//    @CrossOrigin
//    @GetMapping("/user")
//    @ResponseBody
//    public UserVo getUser(@RequestParam Integer userId){
//        User user = userService.selectByPrimaryKey(userId);
//        UserVo userVo = new UserVo();
//        userVo.setUserId(userId);
//        userVo.setUsername(user.getUserName());
//        userVo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
//        userVo.setHobby(user.getHobby());
//        userVo.setPoints(user.getPoints());
//        userVo.setBalance(user.getMoney());
//        return userVo;
//    }

    @CrossOrigin
    @GetMapping("/allStylist")
    @ResponseBody
    public List<StylistVo> getAllStylist(@RequestParam String key, @RequestParam Integer page){
        return stylistService.getAllStylist(key, page);
    }

    @CrossOrigin
    @GetMapping("/stylistQuantities")
    @ResponseBody
    public int getStylistQuantities(@RequestParam String key) {
        return stylistService.getStylistQuantities(key).size();
    }

    @CrossOrigin
    @GetMapping("/deleteStylist")
    @ResponseBody
    public String deleteStylist(@RequestParam Integer stylistId){
        return stylistService.deleteStylist(stylistId);
    }

    @CrossOrigin
    @GetMapping("/examineStylist")
    @ResponseBody
    public Integer examineStylist(@RequestParam Integer stylistId){
        System.out.println("审核中");
        return stylistService.examineStylist(stylistId);
    }


    @CrossOrigin
    @PostMapping("/updateStylist")
    @ResponseBody
    public int updateStylist(StylistVo stylistVo) {
        return stylistService.updateStylist(stylistVo);
    }

    @CrossOrigin
    @PostMapping("/addStylist")
    @ResponseBody
    public int addStylist(StylistVo stylistVo) {
        return stylistService.addStylist(stylistVo);
    }
//
//    @CrossOrigin
//    @GetMapping("/searchUser")
//    @ResponseBody
//    public List<UserVo> searchUser(@RequestParam String key){
//        return userService.searchUser(key);
//    }
}
