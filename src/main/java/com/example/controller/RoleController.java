package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoleController {
    @RequestMapping("/tRole")
    public String toRole(){
        return "/Role/RoleManage";
    }
}
