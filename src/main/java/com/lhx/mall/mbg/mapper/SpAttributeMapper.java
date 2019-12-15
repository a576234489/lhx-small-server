package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpAttribute;
import com.lhx.mall.mbg.model.SpAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpAttributeMapper {
    int countByExample(SpAttributeExample example);

    int deleteByExample(SpAttributeExample example);

    int deleteByPrimaryKey(Short attrId);

    int insert(SpAttribute record);

    int insertSelective(SpAttribute record);

    List<SpAttribute> selectByExampleWithBLOBs(SpAttributeExample example);

    List<SpAttribute> selectByExample(SpAttributeExample example);

    SpAttribute selectByPrimaryKey(Short attrId);

    int updateByExampleSelective(@Param("record") SpAttribute record, @Param("example") SpAttributeExample example);

    int updateByExampleWithBLOBs(@Param("record") SpAttribute record, @Param("example") SpAttributeExample example);

    int updateByExample(@Param("record") SpAttribute record, @Param("example") SpAttributeExample example);

    int updateByPrimaryKeySelective(SpAttribute record);

    int updateByPrimaryKeyWithBLOBs(SpAttribute record);

    int updateByPrimaryKey(SpAttribute record);
}