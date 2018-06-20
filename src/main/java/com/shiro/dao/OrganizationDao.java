package com.shiro.dao;

import com.shiro.entirty.Organization;
import com.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 后台数据访问 所有的dao部分均标注 @Mapper
 */
@Mapper
public interface BackOrganizationMapper extends MyMapper<Organization>{
}
