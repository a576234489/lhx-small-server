package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpOrder;
import com.lhx.mall.mbg.model.SpOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpOrderMapper {
    int countByExample(SpOrderExample example);

    int deleteByExample(SpOrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(SpOrder record);

    int insertSelective(SpOrder record);

    List<SpOrder> selectByExampleWithBLOBs(SpOrderExample example);

    List<SpOrder> selectByExample(SpOrderExample example);

    SpOrder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") SpOrder record, @Param("example") SpOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") SpOrder record, @Param("example") SpOrderExample example);

    int updateByExample(@Param("record") SpOrder record, @Param("example") SpOrderExample example);

    int updateByPrimaryKeySelective(SpOrder record);

    int updateByPrimaryKeyWithBLOBs(SpOrder record);

    int updateByPrimaryKey(SpOrder record);
}