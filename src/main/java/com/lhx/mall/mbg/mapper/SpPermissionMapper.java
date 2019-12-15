package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpPermission;
import com.lhx.mall.mbg.model.SpPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpPermissionMapper {
    int countByExample(SpPermissionExample example);

    int deleteByExample(SpPermissionExample example);

    int deleteByPrimaryKey(Short psId);

    int insert(SpPermission record);

    int insertSelective(SpPermission record);

    List<SpPermission> selectByExample(SpPermissionExample example);

    SpPermission selectByPrimaryKey(Short psId);

    int updateByExampleSelective(@Param("record") SpPermission record, @Param("example") SpPermissionExample example);

    int updateByExample(@Param("record") SpPermission record, @Param("example") SpPermissionExample example);

    int updateByPrimaryKeySelective(SpPermission record);

    int updateByPrimaryKey(SpPermission record);
}