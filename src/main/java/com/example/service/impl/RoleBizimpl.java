package com.example.service.impl;

import com.example.dao.RoleMapper;
import com.example.service.RoleBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleBizimpl implements RoleBiz {
    @Autowired
    private RoleMapper roleMapper;
}
