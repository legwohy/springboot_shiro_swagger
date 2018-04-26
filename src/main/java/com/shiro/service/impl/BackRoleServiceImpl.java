package com.shiro.service.impl;

import com.shiro.dao.BackRoleMapper;
import com.shiro.entirty.BackRole;
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
    public BackRole findRoleByPrimaryKey(int id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateRoleByPrimaryKey(BackRole backRole) {
        return roleMapper.updateByPrimaryKey(backRole)>0;
    }

    @Override
    public boolean updateRoleBySelective(BackRole backRole) {
        return roleMapper.updateByPrimaryKeySelective(backRole)>0;
    }

    @Override
    public boolean deleteRoleByPrimaryKey(BackRole backRole) {
        return roleMapper.deleteByPrimaryKey(backRole)>0;
    }

    @Override
    public List<BackRole> findRoleList(BackRole backRole) {
        return roleMapper.select(backRole);
    }

    @Override
    public int findRoleCount(BackRole backRole) {
        return roleMapper.selectCount(backRole);
    }
}
