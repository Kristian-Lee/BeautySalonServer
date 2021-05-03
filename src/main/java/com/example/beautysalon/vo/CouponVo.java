package com.example.beautysalon.vo;

import lombok.Data;

/**
 * @author Lee
 * @date 2021.5.3  22:52
 * @description
 */
@Data
public class CouponVo {
    Integer couponId;
    String type;
    String value;
    String upTo;
    String dateFrom;
    String dateTo;
    Integer totalNum;
    Integer num;
}
