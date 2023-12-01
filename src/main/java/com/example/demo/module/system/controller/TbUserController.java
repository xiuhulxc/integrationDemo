package com.example.demo.module.system.controller;


import com.example.demo.common.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author LiuXuChao
 * @since 2023-12-01
 */
@RestController
@RequestMapping("/tbUser")
public class TbUserController {

    @PostMapping(value = "/query")
    public ResultVO query(){
        return new ResultVO(200,"操作成功","");
    }

}

