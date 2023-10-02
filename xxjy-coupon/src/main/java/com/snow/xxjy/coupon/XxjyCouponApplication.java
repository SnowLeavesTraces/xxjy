package com.snow.xxjy.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.snow.xxjy.coupon.dao")
@EnableDiscoveryClient
public class XxjyCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyCouponApplication.class, args);
    }

}
