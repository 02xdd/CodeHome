package com.etoak.controller;

import org.springframework.stereotype.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.etoak.bean.User;
import com.etoak.service.UserService;

@Controller
public class UserController {
	
	@Reference(actives=10,timeout=5000,loadbalance="roundrobin",retries=2,
					version="1.0")
	private UserService service;
	
	public String add(User user) {
		return service.add(user);
	}

}
