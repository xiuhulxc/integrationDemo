package com.example.demo.module.system.service.impl;

import com.example.demo.module.system.entity.TbUser;
import com.example.demo.module.system.mapper.TbUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.module.system.service.TbUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author LiuXuChao
 * @since 2023-12-01
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

}
