package com.shiro.service;

import com.shiro.entirty.BackOrganization;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackOrganizationService {

     /** 主键查询*/
     BackOrganization findOrganizationByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateOrganizationByPrimaryKey(BackOrganization backOrganization);

     /** 空字段不会跟新*/
     boolean updateOrganizationBySelective(BackOrganization backOrganization);

     /** 删除*/
     boolean deleteOrganizationByPrimaryKey(BackOrganization backOrganization);

     /** 查询列表*/
     List<BackOrganization> findOrganizationList(BackOrganization backOrganization);

     /** 统计用户*/
     int findOrganizationCount(BackOrganization backOrganization);


}
