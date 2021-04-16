package com.example.beautysalon.dto;

import lombok.Data;

/**
 * @author Lee
 * @date 2021.3.28  21:37
 * @description
 */
@Data
public class CommentDTO {
    Integer commentId;
    Integer orderId;
    Integer stylistId;
    Integer userId;
    String contact;
    String createDate;
    String userName;
    String userAvatar;
    Float rate;
}
