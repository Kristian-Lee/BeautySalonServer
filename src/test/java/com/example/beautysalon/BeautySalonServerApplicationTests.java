package com.example.beautysalon;

import com.example.beautysalon.service.RedisService;
import com.example.beautysalon.service.ReserveService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BeautySalonServerApplicationTests {

    @Resource
    private RedisService redisService;

    @Resource
    private ReserveService reserveService;

    @Test
    void contextLoads() {
        float s = 9.999f;
        float k = 1.211f;
        System.out.println(s/k);
        System.out.println((int) (Math.ceil(s/k)));
    }

}
