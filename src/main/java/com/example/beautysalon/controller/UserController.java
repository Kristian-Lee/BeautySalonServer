package com.example.beautysalon.controller;


import com.alibaba.fastjson.JSON;
import com.example.beautysalon.mbg.model.Stylist;
import com.example.beautysalon.mbg.model.User;
import com.example.beautysalon.response.ResponseBody;
import com.example.beautysalon.response.ResponseCode;
import com.example.beautysalon.service.RedisService;
import com.example.beautysalon.service.StylistService;
import com.example.beautysalon.service.UserService;
import com.example.beautysalon.util.CommonUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @author Lee
 * @date 2021.3.15  01:51
 * @description
 */

@RestController
@RequestMapping("/")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private RedisService redisService;
    @Resource
    private StylistService stylistService;

    private final static String SECURITY_CODE = "BEAUTY_SALON_SECURITY_CODE";
    private HashMap<String, Object> mMap = new HashMap<>();
    private String mToken;

    @PostMapping("signUp")
    public ResponseBody signUp(@RequestBody User user) {
        if (userService.existAccount(user)) {
            return new ResponseBody(ResponseCode.USER_EXIST_FAILED, "");
        }
        User tempUser = userService.insertUser(user);
        if (tempUser.getUserId() > 0) {
            mToken = CommonUtil.encrypt(tempUser.getUserId() + tempUser.getPassword());
            redisService.set(mToken, tempUser.getPhone(), 86400L);
            redisService.set(tempUser.getPhone(), "user", 86400L);
            mMap.put("token", mToken);
            mMap.put("user", JSON.toJSONString(tempUser));
            return new ResponseBody(ResponseCode.SIGN_UP_SUCCESS, mMap);
        }
        return new ResponseBody(ResponseCode.SIGN_UP_FAILED, "");
    }

    @PostMapping("signIn")
    public ResponseBody signIn(@RequestBody User user) {
        mMap = userService.selectUser(user);
        String type;
        if (mMap != null) {
            type = "user";
        } else if ((mMap = stylistService.selectUser(user)) != null) {
            type = "stylist";
        } else {
            return new ResponseBody(ResponseCode.SIGN_IN_FAILED, "");
        }
        String phone = (String) mMap.get("phone");
        mToken = (String) mMap.get("token");
        redisService.set(mToken, phone, 86400L);
        redisService.set(phone, type, 86400L);
        mMap.remove("phone");
        return new ResponseBody(ResponseCode.SIGN_IN_SUCCESS, mMap);
    }

    @PostMapping("verifyIsLogined")
    public ResponseBody verifyIsLogin(@RequestBody String token) {
        System.out.println(redisService.exist(token));
        if (redisService.exist(token)) {
            String phone = redisService.get(token);
            mMap.put("token", token);
            if ("user".equals(redisService.get(phone))) {
                User tempUser = userService.selectByPhone(phone);
                mMap.put("user", JSON.toJSONString(tempUser));
                System.out.println(tempUser.getUserName() + "登录成功");
            } else {
                Stylist tempStylist = stylistService.selectByPhone(phone);
                mMap.put("stylist", JSON.toJSONString(tempStylist));
                System.out.println(tempStylist.getStylistName() + "登录成功");
            }
            return new ResponseBody(ResponseCode.SIGN_IN_SUCCESS, mMap);
        } else {
            return new ResponseBody(ResponseCode.SIGN_IN_FAILED, "");
        }
    }

    @PostMapping("user/data")
    public ResponseBody getUserData(@RequestBody Integer userId) {
        return userService.getUserData(userId);
    }


    @PostMapping("updateUser")
    public ResponseBody updateUser(@RequestBody User user, @RequestHeader("token") String token) {
        return userService.updateUser(user, token);
    }


    @GetMapping("test")
    public String test() {
        return "test";
    }


    @PostMapping("avatar")
    public boolean uploadAvatar(MultipartFile file, String filename) {
        return userService.updateAvatar(file, filename);
    }
}
