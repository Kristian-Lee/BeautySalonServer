package com.example.beautysalon.vo;

import lombok.Data;

/**
 * @author Lee
 * @date 2021.4.11  13:46
 * @description
 */
@Data
public class UserVo {
    private Integer userId;
    private String username;
    private String birthday;
    private String hobby;
    private Integer points;
    private Float balance;
    private String phone;
    private String lastSignIn;
}
