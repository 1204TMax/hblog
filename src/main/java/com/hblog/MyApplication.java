package com.hblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
 * 启动类核心程序类
 */
@SpringBootApplication
public class MyApplication{
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MyApplication.class);
		app.run(args); //启动  	}
}
}