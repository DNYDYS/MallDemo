package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.UserMapper;
import com.macro.mall.tiny.mbg.model.User;
import com.macro.mall.tiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectAll(Integer id) {
        return userMapper.selectAll(id);
    }

}
