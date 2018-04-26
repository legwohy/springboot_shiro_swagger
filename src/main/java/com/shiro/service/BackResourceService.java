package com.shiro.service;

import com.shiro.entirty.BackResource;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackResourceService {

     /** 主键查询*/
     BackResource findResourceByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateResourceByPrimaryKey(BackResource backResource);

     /** 空字段不会跟新*/
     boolean updateResourceBySelective(BackResource backResource);

     /** 删除*/
     boolean deleteResourceByPrimaryKey(BackResource backResource);

     /** 查询列表*/
     List<BackResource> findResourceList(BackResource backResource);

     /** 统计用户*/
     int findResourceCount(BackResource backResource);


}
