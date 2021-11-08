package com.zb.mapper;

import com.zb.model.user3333;

public interface user3333Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user3333 record);

    int insertSelective(user3333 record);

    user3333 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user3333 record);

    int updateByPrimaryKey(user3333 record);
}