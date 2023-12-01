package com.example.demo.module.system.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.common.util.MD5;
import com.example.demo.module.system.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class SystemService {

    @Autowired
    private TbUserService userService;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    public void Login(HashMap<String,String> hashMap) throws Exception{
        String username = hashMap.get("username");
        String password = hashMap.get("password");
        Assert.notNull(username,"用户名为空");
        Assert.notNull(password,"密码为空");
        //使用security
        List<TbUser> userList = userService.list(new QueryWrapper<TbUser>()
                .eq("username", username));
        Assert.notEmpty(userList,"获取不到用户");
        TbUser user = userList.get(0);
        // BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // Assert.isTrue(passwordEncoder.matches(password,user.getPassword()),"密码不正确");

        //需要配置redis
        String userToken = UUID.randomUUID().toString().replace("-", "");
        Map<String, String> attributes = new HashMap<>();
        attributes.put("id", user.getId().toString());
        attributes.put("name", user.getUsername());
        attributes.put("token", userToken);
        jwtTokenProvider.createToken(hashMap);
    }


}
