package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SpGoods implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer goodsId;

    @ApiModelProperty(value = "商品名称")
    private String goodsName;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal goodsPrice;

    @ApiModelProperty(value = "商品数量")
    private Integer goodsNumber;

    @ApiModelProperty(value = "商品重量")
    private Short goodsWeight;

    @ApiModelProperty(value = "类型id")
    private Short catId;

    @ApiModelProperty(value = "图片logo大图")
    private String goodsBigLogo;

    @ApiModelProperty(value = "图片logo小图")
    private String goodsSmallLogo;

    @ApiModelProperty(value = "0:正常  1:删除")
    private String isDel;

    @ApiModelProperty(value = "添加商品时间")
    private Integer addTime;

    @ApiModelProperty(value = "修改商品时间")
    private Integer updTime;

    @ApiModelProperty(value = "软删除标志字段")
    private Integer deleteTime;

    @ApiModelProperty(value = "一级分类id")
    private Short catOneId;

    @ApiModelProperty(value = "二级分类id")
    private Short catTwoId;

    @ApiModelProperty(value = "三级分类id")
    private Short catThreeId;

    @ApiModelProperty(value = "热卖数量")
    private Integer hotMumber;

    @ApiModelProperty(value = "是否促销")
    private Short isPromote;

    @ApiModelProperty(value = "商品状态 0: 未通过 1: 审核中 2: 已审核")
    private Integer goodsState;

    @ApiModelProperty(value = "1.流行2.新款3.精选")
    private Integer goodsType;

    @ApiModelProperty(value = "商品详情介绍")
    private String goodsIntroduce;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Short getGoodsWeight() {
        return goodsWeight;
    }

    public void setGoodsWeight(Short goodsWeight) {
        this.goodsWeight = goodsWeight;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getGoodsBigLogo() {
        return goodsBigLogo;
    }

    public void setGoodsBigLogo(String goodsBigLogo) {
        this.goodsBigLogo = goodsBigLogo;
    }

    public String getGoodsSmallLogo() {
        return goodsSmallLogo;
    }

    public void setGoodsSmallLogo(String goodsSmallLogo) {
        this.goodsSmallLogo = goodsSmallLogo;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Integer updTime) {
        this.updTime = updTime;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Short getCatOneId() {
        return catOneId;
    }

    public void setCatOneId(Short catOneId) {
        this.catOneId = catOneId;
    }

    public Short getCatTwoId() {
        return catTwoId;
    }

    public void setCatTwoId(Short catTwoId) {
        this.catTwoId = catTwoId;
    }

    public Short getCatThreeId() {
        return catThreeId;
    }

    public void setCatThreeId(Short catThreeId) {
        this.catThreeId = catThreeId;
    }

    public Integer getHotMumber() {
        return hotMumber;
    }

    public void setHotMumber(Integer hotMumber) {
        this.hotMumber = hotMumber;
    }

    public Short getIsPromote() {
        return isPromote;
    }

    public void setIsPromote(Short isPromote) {
        this.isPromote = isPromote;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsIntroduce() {
        return goodsIntroduce;
    }

    public void setGoodsIntroduce(String goodsIntroduce) {
        this.goodsIntroduce = goodsIntroduce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsNumber=").append(goodsNumber);
        sb.append(", goodsWeight=").append(goodsWeight);
        sb.append(", catId=").append(catId);
        sb.append(", goodsBigLogo=").append(goodsBigLogo);
        sb.append(", goodsSmallLogo=").append(goodsSmallLogo);
        sb.append(", isDel=").append(isDel);
        sb.append(", addTime=").append(addTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", catOneId=").append(catOneId);
        sb.append(", catTwoId=").append(catTwoId);
        sb.append(", catThreeId=").append(catThreeId);
        sb.append(", hotMumber=").append(hotMumber);
        sb.append(", isPromote=").append(isPromote);
        sb.append(", goodsState=").append(goodsState);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsIntroduce=").append(goodsIntroduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}