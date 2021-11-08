package com.zb.mapper;

import com.zb.model.user33;

public interface user33Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(user33 record);

    int insertSelective(user33 record);

    user33 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(user33 record);

    int updateByPrimaryKey(user33 record);
}