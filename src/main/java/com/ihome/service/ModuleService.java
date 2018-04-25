package com.ihome.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihome.pojo.ModuleInfo;
import com.ihome.dao.ModuleMapper;

@Service
public class ModuleService {
	 private ModuleMapper moduleMapper;

	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	public List<ModuleInfo> findModuleByUserId(int userId) {
		ModuleInfo moduleInfo = new ModuleInfo();
		moduleInfo.setModuleName("admin");
		List<ModuleInfo> list = new ArrayList<ModuleInfo>();
		list.add(moduleInfo);

		return list;
	}
}
