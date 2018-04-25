package com.com.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动SpringBoot
 */
@SpringBootApplication
@MapperScan("com.shiro.dao")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
