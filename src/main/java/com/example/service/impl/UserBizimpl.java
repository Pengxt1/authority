package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizimpl implements UserBiz {
    @Autowired
    private UserMapper userMapper;
    public User selectUserByUsername(String username){
        return userMapper.selectUserByUsername(username);
    }
}