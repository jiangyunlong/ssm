package com.jyl.ssm.service;

import com.jyl.ssm.model.User;

public interface UserService {

	User getUserById(int id);
	
	User getUserByUsername(String username);
}
