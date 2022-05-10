package com.macro.mall.tiny.mbg.mapper;

import com.macro.mall.tiny.mbg.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectAll(Integer id);
}

