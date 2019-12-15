package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpGoodsPics implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer picsId;

    @ApiModelProperty(value = "商品id")
    private Integer goodsId;

    @ApiModelProperty(value = "相册大图800*800")
    private String picsBig;

    @ApiModelProperty(value = "相册中图350*350")
    private String picsMid;

    @ApiModelProperty(value = "相册小图50*50")
    private String picsSma;

    private static final long serialVersionUID = 1L;

    public Integer getPicsId() {
        return picsId;
    }

    public void setPicsId(Integer picsId) {
        this.picsId = picsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getPicsBig() {
        return picsBig;
    }

    public void setPicsBig(String picsBig) {
        this.picsBig = picsBig;
    }

    public String getPicsMid() {
        return picsMid;
    }

    public void setPicsMid(String picsMid) {
        this.picsMid = picsMid;
    }

    public String getPicsSma() {
        return picsSma;
    }

    public void setPicsSma(String picsSma) {
        this.picsSma = picsSma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", picsId=").append(picsId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", picsBig=").append(picsBig);
        sb.append(", picsMid=").append(picsMid);
        sb.append(", picsSma=").append(picsSma);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}