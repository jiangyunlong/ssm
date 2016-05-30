package com.jyl.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jyl.ssm.model.User;
import com.jyl.ssm.service.UserService;
import com.jyl.util.servlet.HttpServletUtil;

/**
 * 
 * @author Long, E-mail:jyl0401@163.com
 * @date 2016年5月30日 下午2:43:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	Logger log = Logger.getLogger(UserController.class);

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
	@RequestMapping("/{userId}")
	public void findOne(HttpServletResponse response, ModelMap modelMap, @PathVariable int userId) throws IOException {
		
		User user = userService.getUserById(userId);
		HttpServletUtil.writeObjectJSON2Response(response, user);
	}
	
	/*@RequestMapping("/showInfos")
	public @ResponseBody Object showUserInfos(){
		List<User> userInfos = userService.getUsers();
		return userInfos;
	}*/
}
