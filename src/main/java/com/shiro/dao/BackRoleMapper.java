package com.shiro.dao;

import com.shiro.entirty.Role;
import com.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色
 */
@Mapper
public interface BackRoleMapper extends MyMapper<Role>{
}
