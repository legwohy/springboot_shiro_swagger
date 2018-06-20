package com.shiro.controller;

import com.shiro.entirty.User;
import com.shiro.service.BackUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * post     insert
 * put      update(除主键外)
 * patch    save&update(跟新某个字段)
 * delete   delete
 * get      query
 */
@Api(value = "用户",description = "用户")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired private BackUserService backUserService;

    @ApiOperation(value = "添加用户",notes = "添加用户") @PostMapping("/add")
    public ModelAndView addUser(@ApiParam(value = "实体用户")@RequestBody User backUser){
        ModelAndView mv = new ModelAndView("user/add");
        String userMobile = backUser.getUserMobile();
        User user = backUserService.findUserByLoginName(userMobile);
        if(user != null){
            // 用户已经存在
        }else {
            mv.addObject("msg","添加用户成功!");
            mv.setViewName("index");
        }
        return mv;
    }

    @ApiOperation(value = "删除用户",notes = "删除用户")//@DeleteMapping("/${id}/delete")
    public ModelAndView deleteUser(@ApiParam(value = "用户id",required = true) @PathVariable Integer id){
        ModelAndView mv = new ModelAndView("user/deleteUser");
        boolean flag = backUserService.deleteUserByPrimaryKey(id);
        if(flag){
            mv.addObject("msg","删除用户成功!");
        }else {
            mv.addObject("msg","删除用户失败!");
        }
        return mv;
    }

    @ApiOperation(value = "跟新用户",notes = "跟新用户")@PutMapping("/put")
    public ModelAndView updateUser(@RequestBody User user){
        ModelAndView mv = new ModelAndView("user/updateUser");
        boolean flag = backUserService.updateUserBySelective(user);
        if(flag){
            mv.addObject("msg","跟新用户成功!");
        }else {
            mv.addObject("msg","跟新用户失败!");
        }
        return mv;
    }
}