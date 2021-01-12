package com.qa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.dao.AdministratorMapper;
import com.qa.springboot.pojo.Administrator;
import com.qa.springboot.pojo.AdministratorExample;
@Service
public class AjaxService {
	
	@Autowired
	AdministratorMapper administratorMapper;

	
	//登录
	public Administrator querylogin(Administrator a) {

		AdministratorExample example= new AdministratorExample();
		example.createCriteria().andAnameEqualTo(a.getAname()).
		andApwEqualTo(a.getApw());
		List<Administrator> l = administratorMapper.selectByExample(example);
		if (l.isEmpty()) {
			return null;
		}
		
		return l.get(0);
	}

}
