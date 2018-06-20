package com.shiro.service.impl;

import com.shiro.dao.BackOrganizationMapper;
import com.shiro.entirty.Organization;
import com.shiro.service.BackOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class BackOrganizationServiceImpl implements BackOrganizationService{
    @Autowired private BackOrganizationMapper organizationMapper;


    @Override
    public Organization findOrganizationByPrimaryKey(int id) {
        return organizationMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateOrganizationByPrimaryKey(Organization organization) {
        return organizationMapper.updateByPrimaryKey(organization)>0;
    }

    @Override
    public boolean updateOrganizationBySelective(Organization organization) {
        return organizationMapper.updateByPrimaryKeySelective(organization)>0;
    }

    @Override
    public boolean deleteOrganizationByPrimaryKey(Organization organization) {
        return organizationMapper.deleteByPrimaryKey(organization)>0;
    }

    @Override
    public List<Organization> findOrganizationList(Organization organization) {
        return organizationMapper.select(organization);
    }

    @Override
    public int findOrganizationCount(Organization organization) {
        return organizationMapper.selectCount(organization);
    }
}
