package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpCategory implements Serializable {
    @ApiModelProperty(value = "分类唯一ID")
    private Integer catId;

    @ApiModelProperty(value = "分类名称")
    private String catName;

    @ApiModelProperty(value = "分类父ID")
    private Integer catPid;

    @ApiModelProperty(value = "分类层级 0: 顶级 1:二级 2:三级")
    private Integer catLevel;

    @ApiModelProperty(value = "是否删除 1为删除")
    private Integer catDeleted;

    private String catIcon;

    private String catSrc;

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getCatPid() {
        return catPid;
    }

    public void setCatPid(Integer catPid) {
        this.catPid = catPid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Integer getCatDeleted() {
        return catDeleted;
    }

    public void setCatDeleted(Integer catDeleted) {
        this.catDeleted = catDeleted;
    }

    public String getCatIcon() {
        return catIcon;
    }

    public void setCatIcon(String catIcon) {
        this.catIcon = catIcon;
    }

    public String getCatSrc() {
        return catSrc;
    }

    public void setCatSrc(String catSrc) {
        this.catSrc = catSrc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catId=").append(catId);
        sb.append(", catName=").append(catName);
        sb.append(", catPid=").append(catPid);
        sb.append(", catLevel=").append(catLevel);
        sb.append(", catDeleted=").append(catDeleted);
        sb.append(", catIcon=").append(catIcon);
        sb.append(", catSrc=").append(catSrc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}