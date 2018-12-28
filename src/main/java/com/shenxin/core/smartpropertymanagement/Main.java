package com.shenxin.core.smartpropertymanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.shenxin.core.smartpropertymanagement"})
@MapperScan(basePackages = {"com.shenxin.core.smartpropertymanagement.persist.mapper"})
public class Main{

	public static void main(String[] args) throws Exception {
		System.setProperty("log4j.skipJansi", "false");
		SpringApplication.run(Main.class, args);
	}
}
