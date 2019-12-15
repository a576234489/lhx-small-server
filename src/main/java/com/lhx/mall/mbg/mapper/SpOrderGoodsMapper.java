package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpOrderGoods;
import com.lhx.mall.mbg.model.SpOrderGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpOrderGoodsMapper {
    int countByExample(SpOrderGoodsExample example);

    int deleteByExample(SpOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpOrderGoods record);

    int insertSelective(SpOrderGoods record);

    List<SpOrderGoods> selectByExample(SpOrderGoodsExample example);

    SpOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpOrderGoods record, @Param("example") SpOrderGoodsExample example);

    int updateByExample(@Param("record") SpOrderGoods record, @Param("example") SpOrderGoodsExample example);

    int updateByPrimaryKeySelective(SpOrderGoods record);

    int updateByPrimaryKey(SpOrderGoods record);
}