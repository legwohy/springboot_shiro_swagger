package com.shiro.service.impl;

import com.shiro.dao.BackUserMapper;
import com.shiro.entirty.BackUser;
import com.shiro.service.BackUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class BackUserServiceImpl implements BackUserService{
    @Autowired private BackUserMapper userMapper;
    @Override
    public BackUser findUserByLoginName(String userName) {
        if(null != userName){
            BackUser backUser = new BackUser();
            backUser.setUserName(userName);
            return userMapper.selectOne(backUser);
        }
        return null;

    }

    @Override
    public BackUser findUserByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateUserByPrimaryKey(BackUser backUser) {
        return userMapper.updateByPrimaryKey(backUser)>0;
    }

    @Override
    public boolean updateUserBySelective(BackUser backUser) {
        return userMapper.updateByPrimaryKeySelective(backUser)>0;
    }

    @Override
    public boolean deleteUserByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public List<BackUser> findUserList(BackUser backUser) {
        return userMapper.select(backUser);
    }

    @Override
    public int findUserCount(BackUser backUser) {
        return userMapper.selectCount(backUser);
    }
}
