package com.qa.springboot.dao;

import com.qa.springboot.pojo.Goodscomment;
import com.qa.springboot.pojo.GoodscommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscommentMapper {
    int countByExample(GoodscommentExample example);

    int deleteByExample(GoodscommentExample example);

    int insert(Goodscomment record);

    int insertSelective(Goodscomment record);

    List<Goodscomment> selectByExampleWithBLOBs(GoodscommentExample example);

    List<Goodscomment> selectByExample(GoodscommentExample example);

    int updateByExampleSelective(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExample(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);
}