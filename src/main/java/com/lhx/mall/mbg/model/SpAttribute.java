package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpAttribute implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Short attrId;

    @ApiModelProperty(value = "属性名称")
    private String attrName;

    @ApiModelProperty(value = "外键，类型id")
    private Short catId;

    @ApiModelProperty(value = "only:输入框(唯一)  many:后台下拉列表/前台单选框")
    private String attrSel;

    @ApiModelProperty(value = "manual:手工录入  list:从列表选择")
    private String attrWrite;

    @ApiModelProperty(value = "删除时间标志")
    private Integer deleteTime;

    @ApiModelProperty(value = "可选值列表信息,例如颜色：白色,红色,绿色,多个可选值通过逗号分隔")
    private String attrVals;

    private static final long serialVersionUID = 1L;

    public Short getAttrId() {
        return attrId;
    }

    public void setAttrId(Short attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public Short getCatId() {
        return catId;
    }

    public void setCatId(Short catId) {
        this.catId = catId;
    }

    public String getAttrSel() {
        return attrSel;
    }

    public void setAttrSel(String attrSel) {
        this.attrSel = attrSel;
    }

    public String getAttrWrite() {
        return attrWrite;
    }

    public void setAttrWrite(String attrWrite) {
        this.attrWrite = attrWrite;
    }

    public Integer getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Integer deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getAttrVals() {
        return attrVals;
    }

    public void setAttrVals(String attrVals) {
        this.attrVals = attrVals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", attrId=").append(attrId);
        sb.append(", attrName=").append(attrName);
        sb.append(", catId=").append(catId);
        sb.append(", attrSel=").append(attrSel);
        sb.append(", attrWrite=").append(attrWrite);
        sb.append(", deleteTime=").append(deleteTime);
        sb.append(", attrVals=").append(attrVals);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}