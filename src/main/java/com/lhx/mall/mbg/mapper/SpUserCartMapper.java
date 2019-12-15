package com.lhx.mall.mbg.mapper;

import com.lhx.mall.mbg.model.SpUserCart;
import com.lhx.mall.mbg.model.SpUserCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpUserCartMapper {
    int countByExample(SpUserCartExample example);

    int deleteByExample(SpUserCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(SpUserCart record);

    int insertSelective(SpUserCart record);

    List<SpUserCart> selectByExampleWithBLOBs(SpUserCartExample example);

    List<SpUserCart> selectByExample(SpUserCartExample example);

    SpUserCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") SpUserCart record, @Param("example") SpUserCartExample example);

    int updateByExampleWithBLOBs(@Param("record") SpUserCart record, @Param("example") SpUserCartExample example);

    int updateByExample(@Param("record") SpUserCart record, @Param("example") SpUserCartExample example);

    int updateByPrimaryKeySelective(SpUserCart record);

    int updateByPrimaryKeyWithBLOBs(SpUserCart record);

    int updateByPrimaryKey(SpUserCart record);
}