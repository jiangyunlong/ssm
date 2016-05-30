package com.jyl.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jyl.ssm.dao.UserMapper;
import com.jyl.ssm.model.User;
import com.jyl.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(int id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User getUserByUsername(String username) {
		return userMapper.selectByUsername(username);
	}

}
