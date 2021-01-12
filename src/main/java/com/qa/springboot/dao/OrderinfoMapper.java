package com.qa.springboot.dao;

import com.qa.springboot.pojo.Orderinfo;
import com.qa.springboot.pojo.OrderinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderinfoMapper {
    int countByExample(OrderinfoExample example);

    int deleteByExample(OrderinfoExample example);

    int insert(Orderinfo record);

    int insertSelective(Orderinfo record);

    List<Orderinfo> selectByExample(OrderinfoExample example);

    int updateByExampleSelective(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);

    int updateByExample(@Param("record") Orderinfo record, @Param("example") OrderinfoExample example);
}