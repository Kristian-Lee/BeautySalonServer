package com.example.beautysalon.vo;

import lombok.Data;

/**
 * @author Lee
 * @date 2021.4.17  16:18
 * @description
 */
@Data
public class ReservationVo {
    Integer reserveId;
    String userName;
    String stylistName;
    String barbershop;
    String createDate;
    String serveDate;
    String services;
    String takeUp;
    String status;
    String origin;
    String points;
    String coupon;
    String realPay;
    String payDate;
    String enableCancel;

}
