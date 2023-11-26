package com.example.demo.module.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys/demo")
public class SysDemoController {
    @GetMapping("/demo")
    public String demo(String[] args) {
        return "sysDemo";
    }
}
