package com.shiro.service;

import com.shiro.entirty.Organization;

import java.util.List;

/**
 * 后台业务控制层
 */
public interface BackOrganizationService {

     /** 主键查询*/
     Organization findOrganizationByPrimaryKey(int id);

     /** 跟新用户*/
     boolean updateOrganizationByPrimaryKey(Organization organization);

     /** 空字段不会跟新*/
     boolean updateOrganizationBySelective(Organization organization);

     /** 删除*/
     boolean deleteOrganizationByPrimaryKey(Organization organization);

     /** 查询列表*/
     List<Organization> findOrganizationList(Organization organization);

     /** 统计用户*/
     int findOrganizationCount(Organization organization);


}
