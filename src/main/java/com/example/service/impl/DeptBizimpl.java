package com.example.service.impl;

import com.example.dao.DeptMapper;
import com.example.service.DeptBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptBizimpl implements DeptBiz {
    @Autowired
    private DeptMapper deptMapper;
}
