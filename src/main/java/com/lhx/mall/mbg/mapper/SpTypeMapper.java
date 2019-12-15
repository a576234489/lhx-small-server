package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpType;
import com.lhx.mall.mbg.model.SpTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpTypeMapper {
    int countByExample(SpTypeExample example);

    int deleteByExample(SpTypeExample example);

    int deleteByPrimaryKey(Short typeId);

    int insert(SpType record);

    int insertSelective(SpType record);

    List<SpType> selectByExample(SpTypeExample example);

    SpType selectByPrimaryKey(Short typeId);

    int updateByExampleSelective(@Param("record") SpType record, @Param("example") SpTypeExample example);

    int updateByExample(@Param("record") SpType record, @Param("example") SpTypeExample example);

    int updateByPrimaryKeySelective(SpType record);

    int updateByPrimaryKey(SpType record);
}