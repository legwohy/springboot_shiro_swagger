package com.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动SpringBoot
 */
@SpringBootApplication //必须标注该注解才能扫描程序里面的注解组件
//@MapperScan("com.swagger.dao")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
