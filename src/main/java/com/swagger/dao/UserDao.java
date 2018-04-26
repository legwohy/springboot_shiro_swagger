package com.swagger.dao;

import com.swagger.entirty.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * 注解@Mapper 是springBoot整合Mybatis独有的，mybatis木有 相当于sqlMapperConfig
 */
@Mapper
public interface UserDao {
    List<HashMap<String,Object>> findUserH();
    HashMap<String,Object> findUserByIdH(HashMap<String, Object> params);


    /** 查询所有的用户*/
    List<User> findUser();

    /** 通过主键查询用户*/
    User findUserById(int id);
    User findUserByPhone(String userPhone);

    /** 添加用户*/
    int insertUser(User user);

    /**　跟新用户*/
    int updateUser(User user);
    int updateUserH(HashMap<String, Object> params);

    /** 删除用户*/
    int deleteUser(int id);


}
