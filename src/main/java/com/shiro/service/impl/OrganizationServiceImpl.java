package com.shiro.service.impl;

import com.shiro.dao.OrganizationDao;
import com.shiro.entirty.Organization;
import com.shiro.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired private OrganizationDao organizationDao;


    @Override
    public Organization findOrganizationByPrimaryKey(int id) {
        return organizationDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateOrganizationByPrimaryKey(Organization organization) {
        return organizationDao.updateByPrimaryKey(organization)>0;
    }

    @Override
    public boolean updateOrganizationBySelective(Organization organization) {
        return organizationDao.updateByPrimaryKeySelective(organization)>0;
    }

    @Override
    public boolean deleteOrganizationByPrimaryKey(Organization organization) {
        return organizationDao.deleteByPrimaryKey(organization)>0;
    }

    @Override
    public List<Organization> findOrganizationList(Organization organization) {
        return organizationDao.select(organization);
    }

    @Override
    public int findOrganizationCount(Organization organization) {
        return organizationDao.selectCount(organization);
    }
}
