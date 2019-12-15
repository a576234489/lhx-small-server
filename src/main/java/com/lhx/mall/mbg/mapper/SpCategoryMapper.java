package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpCategory;
import com.lhx.mall.mbg.model.SpCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpCategoryMapper {
    int countByExample(SpCategoryExample example);

    int deleteByExample(SpCategoryExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(SpCategory record);

    int insertSelective(SpCategory record);

    List<SpCategory> selectByExampleWithBLOBs(SpCategoryExample example);

    List<SpCategory> selectByExample(SpCategoryExample example);

    SpCategory selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") SpCategory record, @Param("example") SpCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") SpCategory record, @Param("example") SpCategoryExample example);

    int updateByExample(@Param("record") SpCategory record, @Param("example") SpCategoryExample example);

    int updateByPrimaryKeySelective(SpCategory record);

    int updateByPrimaryKeyWithBLOBs(SpCategory record);

    int updateByPrimaryKey(SpCategory record);
}