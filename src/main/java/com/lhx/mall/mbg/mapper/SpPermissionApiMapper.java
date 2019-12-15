package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpPermissionApi;
import com.lhx.mall.mbg.model.SpPermissionApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpPermissionApiMapper {
    int countByExample(SpPermissionApiExample example);

    int deleteByExample(SpPermissionApiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpPermissionApi record);

    int insertSelective(SpPermissionApi record);

    List<SpPermissionApi> selectByExample(SpPermissionApiExample example);

    SpPermissionApi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpPermissionApi record, @Param("example") SpPermissionApiExample example);

    int updateByExample(@Param("record") SpPermissionApi record, @Param("example") SpPermissionApiExample example);

    int updateByPrimaryKeySelective(SpPermissionApi record);

    int updateByPrimaryKey(SpPermissionApi record);
}