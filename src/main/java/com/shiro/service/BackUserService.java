package com.shiro.service;

import com.shiro.entirty.BackUser;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackUserService {

    /** 按照登录名查询*/
     BackUser findUserByLoginName(String userName);

     /** 主键查询*/
     BackUser findUserByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateUserByPrimaryKey(BackUser backUser);

     /** 空字段不会跟新*/
     boolean updateUserBySelective(BackUser backUser);

     /** 删除*/
     boolean deleteUserByPrimaryKey(Integer id);

     /** 查询列表*/
     List<BackUser> findUserList(BackUser backUser);

     /** 统计用户*/
     int findUserCount(BackUser backUser);


}
