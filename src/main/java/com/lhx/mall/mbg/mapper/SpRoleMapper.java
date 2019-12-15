package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpRole;
import com.lhx.mall.mbg.model.SpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpRoleMapper {
    int countByExample(SpRoleExample example);

    int deleteByExample(SpRoleExample example);

    int deleteByPrimaryKey(Short roleId);

    int insert(SpRole record);

    int insertSelective(SpRole record);

    List<SpRole> selectByExampleWithBLOBs(SpRoleExample example);

    List<SpRole> selectByExample(SpRoleExample example);

    SpRole selectByPrimaryKey(Short roleId);

    int updateByExampleSelective(@Param("record") SpRole record, @Param("example") SpRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") SpRole record, @Param("example") SpRoleExample example);

    int updateByExample(@Param("record") SpRole record, @Param("example") SpRoleExample example);

    int updateByPrimaryKeySelective(SpRole record);

    int updateByPrimaryKeyWithBLOBs(SpRole record);

    int updateByPrimaryKey(SpRole record);
}