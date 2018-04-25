package com.com.swagger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动SpringBoot
 */
@SpringBootApplication
@MapperScan("com.swagger.dao")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
