package com.com.swagger.controller;

import com.ihome.entirty.User;
import com.ihome.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "用户管理",description = "用户操作")
public class UserController {

    @Autowired private UserService userService;

    @PostMapping("/list")
    @ApiOperation(value = "获取用户列表",notes = "获取用户的完整信息")
    public List<HashMap<String,Object>> findUserList(){
        return userService.getListH();
    }

    @GetMapping("/users/view/{id}")
    @ApiOperation(value = "获取用户对象",notes = "查询用户")
    public User finUser(@ApiParam(value ="用户主键",required = true) @PathVariable Integer id){
        User user = new User();
        if(id != null){
             user = userService.findUserById(id);
        }
        return user;
    }

    @DeleteMapping("/users/delete/{id}")
    @ApiOperation(value = "注销账号",notes = "注销用户账号")
    public boolean deleteUser(@ApiParam(value = "用户id",required = true) @PathVariable Integer id){
        boolean flag = false;
        if(id != null){
            flag = userService.deleteUser(id);
        }
        return flag;
    }

    @PostMapping("/users/add")
    @ApiOperation(value = "注册新用户",notes = "添加注册的用户信息")
    public boolean register(@ApiParam(value = "用户实体")@RequestBody User user){
        boolean flag = false;

        if(user != null){
            flag = userService.insertUser(user);
        }
        return flag;
    }

    @PatchMapping("/users/update/{id}")
    @ApiOperation(value = "跟新用户信息",notes = "跟新用户部分信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "主键",paramType = "path",required = true,dataType = "Integer"),
    })
    public boolean updateUser(@PathVariable Integer id, @ApiParam(value = "实体",required = true)@RequestBody HashMap<String,Object> params){
        if(id != null){
            params.put("id",id);
        }
        return userService.updateUserH(params);
    }
    @PostMapping("/login")
    @ApiOperation(value = "登陆",notes = "用户id和密码模拟登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userPhone",value = "手机号",required = true,paramType = "form"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,paramType = "form")
    })
    public String login(@RequestParam String userPhone,@RequestParam String password){
        User user = userService.findUserByPhone(userPhone);
        if(user != null){
            if(password.equals(user.getPassword())){
                return "success";
            }
        }
        return "fail";
    }


}
