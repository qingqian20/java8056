package com.qa.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.springboot.dao.MultipleMapper;

@Service
public class ComplexSqlService {

	@Autowired
	MultipleMapper MultipleMapper;
	
	public List<Map<String, Object>> selectuser() {
		return MultipleMapper.selectByUserExample(null);
	}

}
