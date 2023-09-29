package com.snow.xxjy.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snow.xxjy.product.dao")
public class XxjyProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyProductApplication.class, args);
    }

}
