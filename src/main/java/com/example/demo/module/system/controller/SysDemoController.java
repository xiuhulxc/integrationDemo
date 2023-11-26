package com.example.demo.module.system.controller;

import com.example.demo.module.system.service.RoleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/demo")
@Tag(name = "一个普通的controller")
public class SysDemoController {

    @Autowired
    private RoleService roleService;

    @Operation(summary = "一个普通的请求")
    @GetMapping("/demo")
    public String demo() {
        String s = roleService.doSomething("fuck u bitch");
        return s;
    }
}
