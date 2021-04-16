package com.example.beautysalon.util;

import com.alibaba.fastjson.JSON;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lee
 * @date  2021.3.16  02:38
 * @description
 */
public class CommonUtil {

    public static String encrypt(String origin) {
        return DigestUtils.md5DigestAsHex(origin.getBytes());
    }

    public static List jsonToList(Class className, List list) {
        List result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(JSON.parseObject(list.get(i).toString(), className));
        }
        return result;
    }

}
