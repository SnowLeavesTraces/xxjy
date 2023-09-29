package com.snow.xxjy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snow.xxjy.order.dao")
public class XxjyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyOrderApplication.class, args);
    }

}
