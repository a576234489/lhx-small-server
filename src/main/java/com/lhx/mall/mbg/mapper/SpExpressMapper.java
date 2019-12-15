package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpExpress;
import com.lhx.mall.mbg.model.SpExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpExpressMapper {
    int countByExample(SpExpressExample example);

    int deleteByExample(SpExpressExample example);

    int deleteByPrimaryKey(Integer expressId);

    int insert(SpExpress record);

    int insertSelective(SpExpress record);

    List<SpExpress> selectByExample(SpExpressExample example);

    SpExpress selectByPrimaryKey(Integer expressId);

    int updateByExampleSelective(@Param("record") SpExpress record, @Param("example") SpExpressExample example);

    int updateByExample(@Param("record") SpExpress record, @Param("example") SpExpressExample example);

    int updateByPrimaryKeySelective(SpExpress record);

    int updateByPrimaryKey(SpExpress record);
}