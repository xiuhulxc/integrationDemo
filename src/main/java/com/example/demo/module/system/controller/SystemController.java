package com.example.demo.module.system.controller;

import com.example.demo.common.R;
import com.example.demo.common.ResultVO;
import com.example.demo.module.system.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/12/1 10:37
 * @version: 1.0
 */
@RestController
@RequestMapping("/system")
public class SystemController {

    @Autowired
    private SystemService systemService;

    @PostMapping("/login")
    public ResultVO login(@RequestBody HashMap<String,String> hashMap)throws Exception{
        systemService.Login(hashMap);
        return new ResultVO(200,"操作成功","");
    }
}
