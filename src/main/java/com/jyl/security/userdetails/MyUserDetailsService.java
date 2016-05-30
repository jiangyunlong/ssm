package com.jyl.security.userdetails;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.jyl.ssm.model.User;
import com.jyl.ssm.service.UserService;

public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userService;
	
	Logger log = Logger.getLogger(MyUserDetailsService.class);

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userService.getUserByUsername(username);
		if(user == null){
			log.debug("username["+username+"] is not exists.");
			return null;
		}
		
		List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
		list.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		UserDetails userDetails = (UserDetails)new org.springframework.security.core.userdetails.User(username, user.getPassword(), list);
		return userDetails;
	}

}
