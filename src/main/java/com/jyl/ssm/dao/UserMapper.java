package com.jyl.ssm.dao;

import java.util.List;

import com.jyl.ssm.model.User;

public interface UserMapper {
	
	User selectByPrimaryKey(Integer id);
    
    User selectByUsername(String username);
    
    List<User> selectAllUser();
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}