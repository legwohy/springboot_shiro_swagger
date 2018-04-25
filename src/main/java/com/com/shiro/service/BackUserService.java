package com.com.shiro.service;

import com.com.shiro.dao.BackUserDao;
import com.com.shiro.entirty.BackUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 后台业务控制层
 */
@Service
public class BackUserService {

    @Autowired private BackUserDao userDao;

    public BackUser findUserByName(String userName){
        return userDao.selectUserByName(userName);
    }

}
