package com.example.beautysalon.vo;

import lombok.Data;

/**
 * @author Lee
 * @date 2021.5.3  00:53
 * @description
 */
@Data
public class BarbershopVo {
    Integer barbershopId;
    String barbershopName;
    String address;
    String owner;
    String open;
    String close;
}
