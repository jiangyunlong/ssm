package com.jyl.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jyl.ssm.model.User;
import com.jyl.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * 返回用户界面
	 * @param modelMap
	 * @param userId
	 * @return
	 */
	@RequestMapping("/showInfo/{userId}")
	public String showInfo(ModelMap modelMap, @PathVariable int userId){
		User user = userService.getUserById(userId);
		modelMap.addAttribute("user", user);
		return "/user/showInfo";
	}
	
	/**
	 * 根据用户ID查询用户信息
	 * @param modelMap
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/{userId}",method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	@ResponseBody
	public User findOne(ModelMap modelMap, @PathVariable int userId){
		return userService.getUserById(userId);
	}
	
	/*@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<User> userInfos = userService.getUsers();
		return userInfos;
	}*/
}
