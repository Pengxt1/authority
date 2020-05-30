package com.example.service.impl;

import com.example.dao.MenuMapper;
import com.example.service.MenuBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuBizimpl implements MenuBiz {
    @Autowired
    private MenuMapper menuMapper;
}
