package com.qa.springboot.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.Administrator;
import com.qa.springboot.service.AjaxService;
import com.qa.springboot.service.ComplexSqlService;



@RestController
@RequestMapping("/ajax")
public class AjaxController {

	
	@Autowired
	AjaxService ajaxservice;
	@Autowired
	ComplexSqlService ComplexSqlService;
	//登录
	@RequestMapping("querylogin")
	public Object querylogin(Administrator a ,HttpSession s) {
		Administrator administrator = ajaxservice.querylogin(a);
			if (administrator!=null) {
				s.setAttribute("administrator", administrator);
				System.out.println("登录Session:"+s.getId());
				return true;
			}
			return false;
	}
	//验证登录状态
		@RequestMapping("administratoronline")
		public Object administratoronline(HttpSession s) {
			System.out.println("检验Session:"+s.getId());
				return s.getAttribute("administrator");
		}
	//查用户
	@RequestMapping("selectuser")
	public  List<Map<String, Object>> selectuser() {
			return ComplexSqlService.selectuser();
	}
	
}
