package com.shiro.service;

import com.shiro.entirty.User;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackUserService {

    /** 按照登录名查询*/
     User findUserByLoginName(String userName);

     /** 主键查询*/
     User findUserByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateUserByPrimaryKey(User user);

     /** 空字段不会跟新*/
     boolean updateUserBySelective(User user);

     /** 删除*/
     boolean deleteUserByPrimaryKey(Integer id);

     /** 查询列表*/
     List<User> findUserList(User user);

     /** 统计用户*/
     int findUserCount(User user);


}
