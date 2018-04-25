package com.ihome.dao;

import java.util.List;

import com.ihome.pojo.ModuleInfo;
import org.springframework.stereotype.Component;

public interface ModuleMapper {

	/**
	 * 获取该人的权限模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
