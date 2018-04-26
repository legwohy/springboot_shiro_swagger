package com.shiro.service.impl;

import com.shiro.dao.BackOrganizationMapper;
import com.shiro.entirty.BackOrganization;
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
    public BackOrganization findOrganizationByPrimaryKey(int id) {
        return organizationMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateOrganizationByPrimaryKey(BackOrganization backOrganization) {
        return organizationMapper.updateByPrimaryKey(backOrganization)>0;
    }

    @Override
    public boolean updateOrganizationBySelective(BackOrganization backOrganization) {
        return organizationMapper.updateByPrimaryKeySelective(backOrganization)>0;
    }

    @Override
    public boolean deleteOrganizationByPrimaryKey(BackOrganization backOrganization) {
        return organizationMapper.deleteByPrimaryKey(backOrganization)>0;
    }

    @Override
    public List<BackOrganization> findOrganizationList(BackOrganization backOrganization) {
        return organizationMapper.select(backOrganization);
    }

    @Override
    public int findOrganizationCount(BackOrganization backOrganization) {
        return organizationMapper.selectCount(backOrganization);
    }
}
