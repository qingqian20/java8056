package com.qa.springboot.dao;

import com.qa.springboot.pojo.Goodssize;
import com.qa.springboot.pojo.GoodssizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodssizeMapper {
    int countByExample(GoodssizeExample example);

    int deleteByExample(GoodssizeExample example);

    int insert(Goodssize record);

    int insertSelective(Goodssize record);

    List<Goodssize> selectByExample(GoodssizeExample example);

    int updateByExampleSelective(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);

    int updateByExample(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);
}