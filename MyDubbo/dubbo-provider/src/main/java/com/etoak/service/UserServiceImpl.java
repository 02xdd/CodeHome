package com.etoak.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.etoak.bean.User;

/**
 * Created by li2xdd on 2018/12/19/0019.
 */
@Service(timeout=5000,retries=2,loadbalance="roundrobin",
        interfaceClass=UserService.class,version="1.0",actives=10)
public class UserServiceImpl implements UserService {
    @Override
    public String add(User user) {
        System.out.println("生成者");
        return "添加："+user;
    }
}
