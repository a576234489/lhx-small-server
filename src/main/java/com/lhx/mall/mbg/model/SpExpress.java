package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpExpress implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer expressId;

    @ApiModelProperty(value = "订单id")
    private Integer orderId;

    @ApiModelProperty(value = "订单快递公司名称")
    private String expressCom;

    @ApiModelProperty(value = "快递单编号")
    private String expressNu;

    @ApiModelProperty(value = "记录生成时间")
    private Integer createTime;

    @ApiModelProperty(value = "记录修改时间")
    private Integer updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getExpressId() {
        return expressId;
    }

    public void setExpressId(Integer expressId) {
        this.expressId = expressId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getExpressCom() {
        return expressCom;
    }

    public void setExpressCom(String expressCom) {
        this.expressCom = expressCom;
    }

    public String getExpressNu() {
        return expressNu;
    }

    public void setExpressNu(String expressNu) {
        this.expressNu = expressNu;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", expressId=").append(expressId);
        sb.append(", orderId=").append(orderId);
        sb.append(", expressCom=").append(expressCom);
        sb.append(", expressNu=").append(expressNu);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}