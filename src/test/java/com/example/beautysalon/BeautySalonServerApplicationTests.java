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

    }

}
