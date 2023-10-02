package com.snow.xxjy.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.snow.xxjy.order.dao")
@EnableDiscoveryClient
public class XxjyOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyOrderApplication.class, args);
    }

}
