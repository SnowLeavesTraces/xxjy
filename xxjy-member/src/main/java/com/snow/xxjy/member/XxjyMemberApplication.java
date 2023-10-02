package com.snow.xxjy.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.snow.xxjy.member.dao")
@EnableDiscoveryClient
@EnableFeignClients("com.snow.xxjy.member.feign")
public class XxjyMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyMemberApplication.class, args);
    }

}
