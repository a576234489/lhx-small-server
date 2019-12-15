package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpManager;
import com.lhx.mall.mbg.model.SpManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpManagerMapper {
    int countByExample(SpManagerExample example);

    int deleteByExample(SpManagerExample example);

    int deleteByPrimaryKey(Integer mgId);

    int insert(SpManager record);

    int insertSelective(SpManager record);

    List<SpManager> selectByExample(SpManagerExample example);

    SpManager selectByPrimaryKey(Integer mgId);

    int updateByExampleSelective(@Param("record") SpManager record, @Param("example") SpManagerExample example);

    int updateByExample(@Param("record") SpManager record, @Param("example") SpManagerExample example);

    int updateByPrimaryKeySelective(SpManager record);

    int updateByPrimaryKey(SpManager record);
}