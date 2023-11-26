package com.example.demo.module.system.controller;

import com.example.demo.module.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/demo")
public class SysDemoController {

    @Autowired
    private RoleService roleService;
    @GetMapping("/demo")
    public String demo() {
        String s = roleService.doSomething("fuck u bitch");
        return s;
    }
}
