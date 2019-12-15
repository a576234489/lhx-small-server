package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpGoods;
import com.lhx.mall.mbg.model.SpGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsMapper {
    int countByExample(SpGoodsExample example);

    int deleteByExample(SpGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(SpGoods record);

    int insertSelective(SpGoods record);

    List<SpGoods> selectByExampleWithBLOBs(SpGoodsExample example);

    List<SpGoods> selectByExample(SpGoodsExample example);

    SpGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") SpGoods record, @Param("example") SpGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SpGoods record, @Param("example") SpGoodsExample example);

    int updateByExample(@Param("record") SpGoods record, @Param("example") SpGoodsExample example);

    int updateByPrimaryKeySelective(SpGoods record);

    int updateByPrimaryKeyWithBLOBs(SpGoods record);

    int updateByPrimaryKey(SpGoods record);
}