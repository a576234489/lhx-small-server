package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpGoodsAttr;
import com.lhx.mall.mbg.model.SpGoodsAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsAttrMapper {
    int countByExample(SpGoodsAttrExample example);

    int deleteByExample(SpGoodsAttrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpGoodsAttr record);

    int insertSelective(SpGoodsAttr record);

    List<SpGoodsAttr> selectByExampleWithBLOBs(SpGoodsAttrExample example);

    List<SpGoodsAttr> selectByExample(SpGoodsAttrExample example);

    SpGoodsAttr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpGoodsAttr record, @Param("example") SpGoodsAttrExample example);

    int updateByExampleWithBLOBs(@Param("record") SpGoodsAttr record, @Param("example") SpGoodsAttrExample example);

    int updateByExample(@Param("record") SpGoodsAttr record, @Param("example") SpGoodsAttrExample example);

    int updateByPrimaryKeySelective(SpGoodsAttr record);

    int updateByPrimaryKeyWithBLOBs(SpGoodsAttr record);

    int updateByPrimaryKey(SpGoodsAttr record);
}