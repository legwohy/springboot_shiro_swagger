package com.shiro.service.impl;

import com.shiro.dao.BackResourceMapper;
import com.shiro.entirty.BackResource;
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
    public BackResource findResourceByPrimaryKey(int id) {
        return resourceMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateResourceByPrimaryKey(BackResource backResource) {
        return resourceMapper.updateByPrimaryKey(backResource)>0;
    }

    @Override
    public boolean updateResourceBySelective(BackResource backResource) {
        return resourceMapper.updateByPrimaryKeySelective(backResource)>0;
    }

    @Override
    public boolean deleteResourceByPrimaryKey(BackResource backResource) {
        return resourceMapper.deleteByPrimaryKey(backResource)>0;
    }

    @Override
    public List<BackResource> findResourceList(BackResource backResource) {
        return resourceMapper.select(backResource);
    }

    @Override
    public int findResourceCount(BackResource backResource) {
        return resourceMapper.selectCount(backResource);
    }
}
