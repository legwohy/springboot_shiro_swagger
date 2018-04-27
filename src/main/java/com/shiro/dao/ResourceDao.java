package com.shiro.dao;

import com.shiro.entirty.Resource;
import com.shiro.entirty.Role;
import com.shiro.entirty.User;
import com.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 资源
 */
@Mapper
public interface ResourceDao extends MyMapper<Resource> {
    /** 根据角色查资源 sql间xml文档*/
    List<Resource> selectResourcesByRole(Role role);

    /** 根据角色查资源 sql间xml文档*/
    List<Resource> selectResourcesByUser(HashMap<String,Object> params);
}
