package com.com.shiro.controller;

import com.com.shiro.entirty.BackUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Api(value = "登陆",description = "shiro权限登陆")
@RestController
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public ModelAndView signIn(){
        return new ModelAndView("login");
    }

    @ApiOperation(value = "登陆",notes = "登陆")
    @ApiImplicitParams({@ApiImplicitParam(name = "username",value = "用户名",dataType = "string",paramType = "query"),
                        @ApiImplicitParam(name = "password",value = "密码",dataType = "string",paramType = "query")})
    @PostMapping("/loginUser")
    public ModelAndView loginUser(@RequestParam String username, @RequestParam String password, HttpSession session) {
        ModelAndView mv = new ModelAndView("login");
        if(username == null){
            return mv;
        }
        try {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username,password);
            Subject subject = SecurityUtils.getSubject();// 主体登陆
            BackUser user = null;
            subject.login(usernamePasswordToken);   //完成登录
            user =(BackUser) subject.getPrincipal();
            session.setAttribute("user",user);

            mv.addObject("index");

            return mv;
        } catch(Exception e) {
            e.printStackTrace();
            return mv;//返回登录页面
        }


    }
    @RequestMapping("/logOut")
    public ModelAndView logOut(HttpSession session) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        session.removeAttribute("user");
        return new ModelAndView("login");
    }

}