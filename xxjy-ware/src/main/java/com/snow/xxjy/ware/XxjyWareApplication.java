package com.snow.xxjy.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.snow.xxjy.ware.dao")
public class XxjyWareApplication {

	public static void main(String[] args) {
		SpringApplication.run(XxjyWareApplication.class, args);
	}

}
