package com.shiro.service.impl;

import com.shiro.dao.ResourceDao;
import com.shiro.entirty.Resource;
import com.shiro.entirty.Role;
import com.shiro.entirty.User;
import com.shiro.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired private ResourceDao resourceDao;
  

    @Override
    public Resource findResourceByPrimaryKey(int id) {
        return resourceDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateResourceByPrimaryKey(Resource resource) {
        return resourceDao.updateByPrimaryKey(resource)>0;
    }

    @Override
    public boolean updateResourceBySelective(Resource resource) {
        return resourceDao.updateByPrimaryKeySelective(resource)>0;
    }

    @Override
    public boolean deleteResourceByPrimaryKey(Resource resource) {
        return resourceDao.deleteByPrimaryKey(resource)>0;
    }

    @Override
    public List<Resource> findResourceList(Resource resource) {
        return resourceDao.select(resource);
    }

    @Override
    public int findResourceCount(Resource resource) {
        return resourceDao.selectCount(resource);
    }

    @Override
    public List<Resource> findResourcesByRole(Role role) {
        return resourceDao.selectResourcesByRole(role);
    }

    @Override
    public List<Resource> findResourcesByUser(HashMap<String,Object> params) {
        return resourceDao.selectResourcesByUser(params);
    }
}
