package com.qa.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Administrator;
import com.qa.springboot.service.AjaxService;


@RestController
@RequestMapping("/ajax")
public class AjaxController {

	
	@Autowired
	AjaxService ajaxservice;
	//登录
	@RequestMapping("querylogin")
	public Object querylogin(Administrator a ,HttpSession s) {
		Administrator administrator = ajaxservice.querylogin(a);
			if (administrator!=null) {
				s.setAttribute("administrator", administrator);
				return true;
			}
			return false;
	}
	//验证登录状态
		@RequestMapping("administratoronline")
		public Object administratoronline(HttpSession s) {
				return s.getAttribute("administrator");
		}
	
}
