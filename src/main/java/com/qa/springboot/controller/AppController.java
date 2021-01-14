package com.qa.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	AjaxController AjaxController;
	
	
	//退出登录
	@RequestMapping("logout")
	public String logout(HttpSession s) {
		System.out.println("删除Session:"+s.getId());
		s.removeAttribute("administrator");
		AjaxController.administratoronline(s);
			return "redirect:http://127.0.0.1:9000/login";
	}
}
