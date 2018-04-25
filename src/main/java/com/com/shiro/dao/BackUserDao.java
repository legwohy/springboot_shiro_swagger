package com.com.shiro.dao;

import com.com.shiro.entirty.BackUser;
import org.springframework.stereotype.Component;

/**
 * 后台数据访问
 */
@Component
public interface BackUserDao {
    BackUser selectUserByName(String userName);
}
