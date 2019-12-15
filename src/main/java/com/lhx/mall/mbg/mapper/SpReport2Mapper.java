package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpReport2;
import com.lhx.mall.mbg.model.SpReport2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpReport2Mapper {
    int countByExample(SpReport2Example example);

    int deleteByExample(SpReport2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpReport2 record);

    int insertSelective(SpReport2 record);

    List<SpReport2> selectByExample(SpReport2Example example);

    SpReport2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpReport2 record, @Param("example") SpReport2Example example);

    int updateByExample(@Param("record") SpReport2 record, @Param("example") SpReport2Example example);

    int updateByPrimaryKeySelective(SpReport2 record);

    int updateByPrimaryKey(SpReport2 record);
}