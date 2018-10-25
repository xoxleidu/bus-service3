package com.zjts.buscenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zjts.buscenter.*.dao")
public class BusCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusCenterApplication.class, args);
	}
}
