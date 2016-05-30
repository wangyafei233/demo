package com.zb.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zb.dao.UserDao;
import com.zb.entity.User;
import com.zb.service.UserService;

/**
 * 
 * 
 * 作者: zhoubang 日期：2015年9月25日 上午9:01:11
 */
@Controller
@RequestMapping(value = "/users")
public class UsersController {

	@Resource(name = "userServiceImpl")
	// 可以指定具体的bean.
	private UserService userService;
	// @Resource(name = "userDaoImpl")
	// private UserDao userDaoImpl;

	@RequestMapping("/getUsers")
	public ModelAndView getUsers(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("访问控制器...");
		ModelAndView mv=new ModelAndView();
		List<User> users = userService.getAll();
		mv.addObject("user", users);
		mv.setViewName("/index");
		// List<User> users = userDaoImpl.getAll();
		for (int i = 0; i < users.size(); i++) {
			User u = (User) users.get(i);
			System.out.println(u.toString());
		}
		return mv;
	}
}
