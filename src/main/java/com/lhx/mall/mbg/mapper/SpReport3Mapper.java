package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpReport3;
import com.lhx.mall.mbg.model.SpReport3Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpReport3Mapper {
    int countByExample(SpReport3Example example);

    int deleteByExample(SpReport3Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpReport3 record);

    int insertSelective(SpReport3 record);

    List<SpReport3> selectByExample(SpReport3Example example);

    SpReport3 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpReport3 record, @Param("example") SpReport3Example example);

    int updateByExample(@Param("record") SpReport3 record, @Param("example") SpReport3Example example);

    int updateByPrimaryKeySelective(SpReport3 record);

    int updateByPrimaryKey(SpReport3 record);
}