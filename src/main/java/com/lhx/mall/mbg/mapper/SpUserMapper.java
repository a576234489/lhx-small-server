package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpUser;
import com.lhx.mall.mbg.model.SpUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpUserMapper {
    int countByExample(SpUserExample example);

    int deleteByExample(SpUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(SpUser record);

    int insertSelective(SpUser record);

    List<SpUser> selectByExampleWithBLOBs(SpUserExample example);

    List<SpUser> selectByExample(SpUserExample example);

    SpUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByExample(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByPrimaryKeySelective(SpUser record);

    int updateByPrimaryKeyWithBLOBs(SpUser record);

    int updateByPrimaryKey(SpUser record);
}