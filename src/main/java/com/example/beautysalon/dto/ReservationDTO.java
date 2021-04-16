package com.example.beautysalon.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author Lee
 * @date 2021.4.14  19:29
 * @description
 */
@Data
public class ReservationDTO {
    Integer reservationId;
    Date serveDate;
    String userName;
    String services;
    String hobby;
}
