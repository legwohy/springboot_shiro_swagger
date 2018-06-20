package com.shiro.service.impl;

import com.shiro.dao.BackUserMapper;
import com.shiro.entirty.User;
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
    public User findUserByLoginName(String userName) {
        if(null != userName){
            User user = new User();
            user.setUserName(userName);
            return userMapper.selectOne(user);
        }
        return null;

    }

    @Override
    public User findUserByPrimaryKey(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateUserByPrimaryKey(User user) {
        return userMapper.updateByPrimaryKey(user)>0;
    }

    @Override
    public boolean updateUserBySelective(User user) {
        return userMapper.updateByPrimaryKeySelective(user)>0;
    }

    @Override
    public boolean deleteUserByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id)>0;
    }

    @Override
    public List<User> findUserList(User user) {
        return userMapper.select(user);
    }

    @Override
    public int findUserCount(User user) {
        return userMapper.selectCount(user);
    }
}
