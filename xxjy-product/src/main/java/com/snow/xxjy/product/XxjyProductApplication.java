package com.snow.xxjy.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.snow.xxjy.product.dao")
@EnableDiscoveryClient
public class XxjyProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyProductApplication.class, args);
    }

}
