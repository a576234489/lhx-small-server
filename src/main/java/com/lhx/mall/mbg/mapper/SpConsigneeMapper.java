package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpConsignee;
import com.lhx.mall.mbg.model.SpConsigneeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpConsigneeMapper {
    int countByExample(SpConsigneeExample example);

    int deleteByExample(SpConsigneeExample example);

    int deleteByPrimaryKey(Integer cgnId);

    int insert(SpConsignee record);

    int insertSelective(SpConsignee record);

    List<SpConsignee> selectByExample(SpConsigneeExample example);

    SpConsignee selectByPrimaryKey(Integer cgnId);

    int updateByExampleSelective(@Param("record") SpConsignee record, @Param("example") SpConsigneeExample example);

    int updateByExample(@Param("record") SpConsignee record, @Param("example") SpConsigneeExample example);

    int updateByPrimaryKeySelective(SpConsignee record);

    int updateByPrimaryKey(SpConsignee record);
}