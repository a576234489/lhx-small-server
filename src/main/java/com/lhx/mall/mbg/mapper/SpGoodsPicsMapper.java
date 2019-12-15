package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpGoodsPics;
import com.lhx.mall.mbg.model.SpGoodsPicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsPicsMapper {
    int countByExample(SpGoodsPicsExample example);

    int deleteByExample(SpGoodsPicsExample example);

    int deleteByPrimaryKey(Integer picsId);

    int insert(SpGoodsPics record);

    int insertSelective(SpGoodsPics record);

    List<SpGoodsPics> selectByExample(SpGoodsPicsExample example);

    SpGoodsPics selectByPrimaryKey(Integer picsId);

    int updateByExampleSelective(@Param("record") SpGoodsPics record, @Param("example") SpGoodsPicsExample example);

    int updateByExample(@Param("record") SpGoodsPics record, @Param("example") SpGoodsPicsExample example);

    int updateByPrimaryKeySelective(SpGoodsPics record);

    int updateByPrimaryKey(SpGoodsPics record);
}