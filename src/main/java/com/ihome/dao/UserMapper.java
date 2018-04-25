package com.ihome.dao;

import com.ihome.pojo.UserInfo;


public interface UserMapper {


	UserInfo findByAccount(String account);
}
