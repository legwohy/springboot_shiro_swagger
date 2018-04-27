package com.shiro.service;

import com.shiro.entirty.Resource;
import com.shiro.entirty.Role;
import com.shiro.entirty.User;

import java.util.HashMap;
import java.util.List;

/**
 * 后台业务控制层
 */
public interface ResourceService {

     /** 主键查询*/
     Resource findResourceByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateResourceByPrimaryKey(Resource resource);

     /** 空字段不会跟新*/
     boolean updateResourceBySelective(Resource resource);

     /** 删除*/
     boolean deleteResourceByPrimaryKey(Resource resource);

     /** 查询列表*/
     List<Resource> findResourceList(Resource resource);

     /** 统计用户*/
     int findResourceCount(Resource resource);

     /** 根据角色查询资源*/
     List<Resource> findResourcesByRole(Role role);

     /** 根据用户查询资源*/
     List<Resource> findResourcesByUser(HashMap<String,Object> params);


}
