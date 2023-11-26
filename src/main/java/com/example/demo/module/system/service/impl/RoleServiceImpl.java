package com.example.demo.module.system.service.impl;

import com.example.demo.entity.po.Role;
import com.example.demo.module.system.dao.RoleDao;
import com.example.demo.module.system.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public String doSomething(String something) {
        List<Role> roles = roleDao.listResourceRoles();
//        List<Role> roles = roleDao.selectList(null);
        roles.forEach(System.out::println);
        return something;
    }
}
