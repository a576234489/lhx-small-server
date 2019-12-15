package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpConsignee implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer cgnId;

    @ApiModelProperty(value = "会员id")
    private Integer userId;

    @ApiModelProperty(value = "收货人名称")
    private String cgnName;

    @ApiModelProperty(value = "收货人地址")
    private String cgnAddress;

    @ApiModelProperty(value = "收货人电话")
    private String cgnTel;

    @ApiModelProperty(value = "邮编")
    private String cgnCode;

    @ApiModelProperty(value = "删除时间")
    private Integer deleteTime;

    private static final long serialVersionUID = 1L;

    public Integer getCgnId() {
        return cgnId;
    }

    public void setCgnId(Integer cgnId) {
        this.cgnId = cgnId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCgnName() {
        return cgnName;
    }

    public void setCgnName(String cgnName) {
        this.cgnName = cgnName;
    }

    public String getCgnAddress() {
        return cgnAddress;
    }

    public void setCgnAddress(String cgnAddress) {
        this.cgnAddress = cgnAddress;
    }

    public String getCgnTel() {
        return cgnTel;
    }

    public void setCgnTel(String cgnTel) {
        this.cgnTel = cgnTel;
    }

    public String getCgnCode() {
        return cgnCode;
    }

    public void setCgnCode(String cgnCode) {
        this.cgnCode = cgnCode;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cgnId=").append(cgnId);
        sb.append(", userId=").append(userId);
        sb.append(", cgnName=").append(cgnName);
        sb.append(", cgnAddress=").append(cgnAddress);
        sb.append(", cgnTel=").append(cgnTel);
        sb.append(", cgnCode=").append(cgnCode);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}