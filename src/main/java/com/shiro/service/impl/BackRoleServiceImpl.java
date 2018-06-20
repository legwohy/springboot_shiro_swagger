package com.shiro.service.impl;

import com.shiro.dao.BackRoleMapper;
import com.shiro.entirty.Role;
import com.shiro.service.BackRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class BackRoleServiceImpl implements BackRoleService{
    @Autowired private BackRoleMapper roleMapper;


    @Override
    public Role findRoleByPrimaryKey(int id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateRoleByPrimaryKey(Role role) {
        return roleMapper.updateByPrimaryKey(role)>0;
    }

    @Override
    public boolean updateRoleBySelective(Role role) {
        return roleMapper.updateByPrimaryKeySelective(role)>0;
    }

    @Override
    public boolean deleteRoleByPrimaryKey(Role role) {
        return roleMapper.deleteByPrimaryKey(role)>0;
    }

    @Override
    public List<Role> findRoleList(Role role) {
        return roleMapper.select(role);
    }

    @Override
    public int findRoleCount(Role role) {
        return roleMapper.selectCount(role);
    }
}
