package com.lyj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com/lyj/dao") //扫描mybatis注解
@SpringBootApplication
public class BisheApplication {

	public static void main(String[] args) {
		SpringApplication.run(BisheApplication.class, args);
	}

}

