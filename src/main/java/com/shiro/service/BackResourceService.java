package com.shiro.service;

import com.shiro.entirty.Resource;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackResourceService {

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


}
