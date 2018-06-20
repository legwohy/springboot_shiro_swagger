package com.shiro.service.impl;

import com.shiro.dao.BackResourceMapper;
import com.shiro.entirty.Resource;
import com.shiro.service.BackResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class BackResourceServiceImpl implements BackResourceService{
    @Autowired private BackResourceMapper resourceMapper;
  

    @Override
    public Resource findResourceByPrimaryKey(int id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateResourceByPrimaryKey(Resource resource) {
        return resourceMapper.updateByPrimaryKey(resource)>0;
    }

    @Override
    public boolean updateResourceBySelective(Resource resource) {
        return resourceMapper.updateByPrimaryKeySelective(resource)>0;
    }

    @Override
    public boolean deleteResourceByPrimaryKey(Resource resource) {
        return resourceMapper.deleteByPrimaryKey(resource)>0;
    }

    @Override
    public List<Resource> findResourceList(Resource resource) {
        return resourceMapper.select(resource);
    }

    @Override
    public int findResourceCount(Resource resource) {
        return resourceMapper.selectCount(resource);
    }
}
