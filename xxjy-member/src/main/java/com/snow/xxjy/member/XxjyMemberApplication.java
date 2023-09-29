package com.snow.xxjy.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snow.xxjy.member.dao")
public class XxjyMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxjyMemberApplication.class, args);
    }

}
