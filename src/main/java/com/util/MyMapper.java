package com.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper 只能简单的增删改查，若复杂一点 还是需要在xml中写
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
    // FIXME 本接口不能被扫描到
}
