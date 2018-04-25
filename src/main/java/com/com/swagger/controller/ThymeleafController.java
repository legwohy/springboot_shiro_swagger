package com.com.swagger.controller;

import io.swagger.annotations.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试视图解析和使用Thymeleaf模板
 */
@RestController
@RequestMapping("/mv")
@Api(value = "thymeleaf",description = "thymeleaf模板访问静态页面")
public class ThymeleafController {
    @GetMapping("/login")
    @ApiOperation(value = "登陆",notes = "用户名和密码登陆")
    public String login(@ApiParam(value = "用户名",required = true)@RequestParam String username,
                        @ApiParam(value = "密码",required = true)@RequestParam String pwd){
        if("jack".equals(username)){
            if(null != pwd){return "okay";}
        }
        return null;
    }
    /**
     * 使用modelAndView解析视图
     */
    @GetMapping("/show")
    @ApiImplicitParams({@ApiImplicitParam(name = "username",value = "用户名",required = true,dataType = "string"),
                        @ApiImplicitParam(name = "pwd",value = "密码",required = true,dataType = "string")}
    )
    @ApiOperation(value = "解析视图",notes = "使用ModelAndView解析并访问静态页面")
    public ModelAndView login1(Model model,@RequestParam String username,@RequestParam String pwd){
        ModelAndView mv = new ModelAndView("login");
        if("jack".equals(username)){
            if(null != pwd){
                mv.addObject("test","mv has logged in");
                model.addAttribute("hello","model has logged in");
            }
        }

        return mv;
    }


}
