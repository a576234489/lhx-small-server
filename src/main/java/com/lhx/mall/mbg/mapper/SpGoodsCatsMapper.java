package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpGoodsCats;
import com.lhx.mall.mbg.model.SpGoodsCatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsCatsMapper {
    int countByExample(SpGoodsCatsExample example);

    int deleteByExample(SpGoodsCatsExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(SpGoodsCats record);

    int insertSelective(SpGoodsCats record);

    List<SpGoodsCats> selectByExample(SpGoodsCatsExample example);

    SpGoodsCats selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") SpGoodsCats record, @Param("example") SpGoodsCatsExample example);

    int updateByExample(@Param("record") SpGoodsCats record, @Param("example") SpGoodsCatsExample example);

    int updateByPrimaryKeySelective(SpGoodsCats record);

    int updateByPrimaryKey(SpGoodsCats record);
}