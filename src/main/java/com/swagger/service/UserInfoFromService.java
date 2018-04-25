package com.swagger.service;

import com.swagger.entirty.UserInfoFrom;

import java.util.List;

/**
 * 基本业务类
 */
public interface UserInfoFromService {
    UserInfoFrom findUserInfoFromByPrimaryKey(int id);
    List<UserInfoFrom> findUserInfoFromList(UserInfoFrom userInfoFrom);
}
