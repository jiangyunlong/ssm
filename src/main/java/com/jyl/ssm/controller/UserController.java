package com.jyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyl.ssm.model.User;
import com.jyl.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
		User user = userService.getUserById(userId);
		/*User user = new User();
		user.setId(1);
		user.setUsername("test");*/
		modelMap.addAttribute("user", user);
		return "/user/showInfo";
	}
	
	/*@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<User> userInfos = userService.getUsers();
		return userInfos;
	}*/
}
