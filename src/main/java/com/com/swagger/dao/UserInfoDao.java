package com.com.swagger.dao;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

/**
 * 注解@Mapper 是springBoot整合Mybatis独有的，mybatis木有 相当于sqlMapperConfig
 */
@Component
public interface UserInfoDao {
    List<HashMap<String,Object>> findUserInfo();
}
