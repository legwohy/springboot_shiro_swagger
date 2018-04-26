package com.shiro.service;

import com.shiro.entirty.BackRole;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackRoleService {

     /** 主键查询*/
     BackRole findRoleByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateRoleByPrimaryKey(BackRole backRole);

     /** 空字段不会跟新*/
     boolean updateRoleBySelective(BackRole backRole);

     /** 删除*/
     boolean deleteRoleByPrimaryKey(BackRole backRole);

     /** 查询列表*/
     List<BackRole> findRoleList(BackRole backRole);

     /** 统计用户*/
     int findRoleCount(BackRole backRole);


}
