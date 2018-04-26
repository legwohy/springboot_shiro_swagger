package com.swagger.dao;

import com.swagger.entirty.UserInfoFrom;
import com.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 本mapper 只提供基本的sql增删该查 若想实现更复杂的sql，
 * 需要在application.yml 中指定mybatis 的mapper扫描文件位置，然后在mapper中写sql语句
 */
@Mapper // 必须添加此注解 方可扫描到本mapper文件
public interface UserInfoFromDAO extends MyMapper<UserInfoFrom> {
}
