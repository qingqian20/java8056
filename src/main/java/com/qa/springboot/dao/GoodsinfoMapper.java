package com.qa.springboot.dao;

import com.qa.springboot.pojo.Goodsinfo;
import com.qa.springboot.pojo.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsinfoMapper {
    int countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);
}