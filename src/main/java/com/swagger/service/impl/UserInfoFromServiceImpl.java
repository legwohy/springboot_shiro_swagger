package com.swagger.service.impl;

import com.swagger.dao.UserInfoFromDAO;
import com.swagger.entirty.UserInfoFrom;
import com.swagger.service.UserInfoFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 基本业务类
 */
@Service
public class UserInfoFromServiceImpl implements UserInfoFromService {
    @Autowired private UserInfoFromDAO userInfoFromDAO;
    public UserInfoFrom findUserInfoFromByPrimaryKey(int id){
        return userInfoFromDAO.selectByPrimaryKey(id);
    }

    public List<UserInfoFrom> findUserInfoFromList(UserInfoFrom userInfoFrom){
        return userInfoFromDAO.select(userInfoFrom);
    }
}
