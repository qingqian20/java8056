package com.qa.springboot.dao;

import java.util.List;
import java.util.Map;


import com.qa.springboot.pojo.OrderinfoExample;

public interface MultipleMapper {

	List<Map<String, Object>> selectByUserExample(OrderinfoExample example);
}
