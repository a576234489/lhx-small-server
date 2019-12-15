package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpReport1;
import com.lhx.mall.mbg.model.SpReport1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpReport1Mapper {
    int countByExample(SpReport1Example example);

    int deleteByExample(SpReport1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpReport1 record);

    int insertSelective(SpReport1 record);

    List<SpReport1> selectByExample(SpReport1Example example);

    SpReport1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpReport1 record, @Param("example") SpReport1Example example);

    int updateByExample(@Param("record") SpReport1 record, @Param("example") SpReport1Example example);

    int updateByPrimaryKeySelective(SpReport1 record);

    int updateByPrimaryKey(SpReport1 record);
}