package com.example.demo.module.system.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/12/1 15:42
 * @version: 1.0
 */
@Service
public class MyRedisService {


    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
