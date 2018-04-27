package com.shiro.service.impl;

import com.shiro.dao.UserDao;
import com.shiro.entirty.User;
import com.shiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired private UserDao userDao;
    @Override
    public User findUserByLoginName(String userName) {
        if(null != userName){
            User user = new User();
            user.setUserName(userName);
            return userDao.selectOne(user);
        }
        return null;

    }

    @Override
    public User findUserByPrimaryKey(int id) {
        return userDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateUserByPrimaryKey(User user) {
        return userDao.updateByPrimaryKey(user)>0;
    }

    @Override
    public boolean updateUserBySelective(User user) {
        return userDao.updateByPrimaryKeySelective(user)>0;
    }

    @Override
    public boolean deleteUserByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id)>0;
    }

    @Override
    public List<User> findUserList(User user) {
        return userDao.select(user);
    }

    @Override
    public int findUserCount(User user) {
        return userDao.selectCount(user);
    }
}
