package com.example.demo.module.system.mapper;

import com.example.demo.module.system.entity.TbUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author LiuXuChao
 * @since 2023-12-01
 */
@Mapper
public interface TbUserMapper extends BaseMapper<TbUser> {

}
