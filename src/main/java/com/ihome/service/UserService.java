package com.ihome.service;

import java.util.*;
import org.springframework.stereotype.Service;
import com.ihome.pojo.UserInfo;
import com.ihome.dao.UserMapper;

@Service
public class UserService{
	 private UserMapper userMapper;
	 private ModuleService moduleService;

	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	public UserInfo findByAccount(String account) {
		UserInfo userInfo = new UserInfo();
		if("jack".equals(account)){
			userInfo.setAccount("jack");
			userInfo.setId(1001);
			userInfo.setName("rose");
			userInfo.setPassword("123");
		}
		return userInfo;
	}

	/**
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	public Set<String> findPermissions(String account) {

		Set<String> set = new HashSet<String>();
		if("jack".equals(account)){
			set.add("add");
			set.add("delete");
			set.add("update");
			set.add("query");
		}else {
			set.add("query");
			set.add("add");
		}

		return set;
	}


}