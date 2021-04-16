package com.example.beautysalon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.example.beautysalon.mbg.mapper")
@SpringBootApplication
public class BeautySalonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautySalonServerApplication.class, args);
    }

}
