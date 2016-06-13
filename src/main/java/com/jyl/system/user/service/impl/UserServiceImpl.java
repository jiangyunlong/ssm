package com.jyl.system.user.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.jyl.system.user.dao.UserMapper;
import com.jyl.system.user.model.User;
import com.jyl.system.user.service.UserService;

/**
 * 
 * @author Long, E-mail:jyl0401@163.com
 * @date 2016年5月30日 下午2:43:53
 */
@Service
public class UserServiceImpl implements UserService {
	
	Logger log = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User getUserByUsername(String username) {
		
		return userMapper.selectByUsername(username);
	}

	@Override
	public List<User> getUserList() {
		
		return userMapper.selectAllUser();
	}

	@Override
	public void insertOne(User user) {
		
		Assert.notNull(user, "param user cannot be null");
		
		if(!StringUtils.hasText(user.getUsername())){
			log.error("param username cannot be null or empty.");
			return;
		}
		
		if(!StringUtils.hasText(user.getPassword())){
			log.error("param password cannot be null or empty.");
			return;
		}
		
		if(user.getAge() == null || user.getAge()<=0){
			log.error("param age cannot be null or <=0.");
			return;
		}
		
		userMapper.insert(user);
	}

	@Override
	public void editOne(User user) {
		
		Assert.notNull(user, "param userId cannot be null");
		userMapper.updateByPrimaryKeySelective(user);
	}

}
