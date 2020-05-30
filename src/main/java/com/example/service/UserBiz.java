package com.example.service;

import com.example.entity.User;

public interface UserBiz {
    User selectUserByUsername(String username);
}
