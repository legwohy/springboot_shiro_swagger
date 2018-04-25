package com.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试springBoot
 *
 */
@RestController
@RequestMapping("/hello")
@Api(value = "springBoot启动",description = "万事开头难")
public class HelloController {

    @RequestMapping("/hi")
    @ApiOperation(value = "helloWorld",notes = "我的第一个SpringBoot项目")
    public String greeting(){
        return "hello World";
    }
}
