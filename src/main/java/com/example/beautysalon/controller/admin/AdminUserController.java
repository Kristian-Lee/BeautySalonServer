package com.example.beautysalon.controller.admin;


import com.example.beautysalon.mbg.model.User;
import com.example.beautysalon.service.UserService;
import com.example.beautysalon.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Lee
 * @date 2021.4.11  13:45
 * @description
 */
@Controller
@RequestMapping("/admin")
public class AdminUserController {

    @Resource
    private UserService userService;


    @GetMapping("/index")
    public String toAdminUser(){
        return "index";
    }

    @CrossOrigin
    @GetMapping("/user")
    @ResponseBody
    public UserVo getUser(@RequestParam Integer userId){
        User user = userService.selectByPrimaryKey(userId);
        UserVo userVo = new UserVo();
        userVo.setUserId(userId);
        userVo.setUsername(user.getUserName());
        userVo.setBirthday(new SimpleDateFormat("yyyy-MM-dd").format(user.getBirthday()));
        userVo.setHobby(user.getHobby());
        userVo.setPoints(user.getPoints());
        userVo.setBalance(user.getMoney());
        return userVo;
    }

    @CrossOrigin
    @GetMapping("/allUser")
    @ResponseBody
    public List<UserVo> getAllUser(@RequestParam Integer page){
        return userService.getAllUser(page);
    }

    @CrossOrigin
    @GetMapping("/userQuantities")
    @ResponseBody
    public int getUserQuantities() {
        return userService.getUserQuantities();
    }

    @CrossOrigin
    @GetMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(@RequestParam Integer userId){
        return userService.deleteUser(userId);
    }

    @CrossOrigin
    @PostMapping("/updateUser")
    @ResponseBody
    public int getAllUser(UserVo userVo) throws ParseException {
        return userService.updateUser(userVo);
    }

    @CrossOrigin
    @PostMapping("/addUser")
    @ResponseBody
    public int addUser(UserVo userVo) throws ParseException {
        return userService.addUser(userVo);
    }

    @CrossOrigin
    @GetMapping("/searchUser")
    @ResponseBody
    public List<UserVo> searchUser(@RequestParam String key){
        return userService.searchUser(key);
    }
}
