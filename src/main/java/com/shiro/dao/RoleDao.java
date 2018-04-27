package com.shiro.dao;

import com.shiro.entirty.Role;
import com.shiro.entirty.User;
import com.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色
 */
@Mapper
public interface RoleDao extends MyMapper<Role>{
    /** 用户查询角色*/
    List<Role> selectRolesByUser(User user);
}
