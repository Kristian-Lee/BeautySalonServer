package com.example.beautysalon.response;

import lombok.*;

/**
 * @author Lee
 * @date 2021.3.15
 * @description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResponseBody {
    private int code;
    private Object data;
}
