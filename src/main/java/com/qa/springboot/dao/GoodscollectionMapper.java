package com.qa.springboot.dao;

import com.qa.springboot.pojo.Goodscollection;
import com.qa.springboot.pojo.GoodscollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscollectionMapper {
    int countByExample(GoodscollectionExample example);

    int deleteByExample(GoodscollectionExample example);

    int insert(Goodscollection record);

    int insertSelective(Goodscollection record);

    List<Goodscollection> selectByExample(GoodscollectionExample example);

    int updateByExampleSelective(@Param("record") Goodscollection record, @Param("example") GoodscollectionExample example);

    int updateByExample(@Param("record") Goodscollection record, @Param("example") GoodscollectionExample example);
}