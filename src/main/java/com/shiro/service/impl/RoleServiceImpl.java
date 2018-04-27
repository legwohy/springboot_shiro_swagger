package com.shiro.service.impl;

import com.shiro.dao.RoleDao;
import com.shiro.entirty.Role;
import com.shiro.entirty.User;
import com.shiro.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired private RoleDao roleDao;


    @Override
    public Role findRoleByPrimaryKey(int id) {
        return roleDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateRoleByPrimaryKey(Role role) {
        return roleDao.updateByPrimaryKey(role)>0;
    }

    @Override
    public boolean updateRoleBySelective(Role role) {
        return roleDao.updateByPrimaryKeySelective(role)>0;
    }

    @Override
    public boolean deleteRoleByPrimaryKey(Role role) {
        return roleDao.deleteByPrimaryKey(role)>0;
    }

    @Override
    public List<Role> findRoleList(Role role) {
        return roleDao.select(role);
    }

    @Override
    public int findRoleCount(Role role) {
        return roleDao.selectCount(role);
    }

    @Override
    public List<Role> findRolesByUser(User user) {
        return roleDao.selectRolesByUser(user);
    }
}
