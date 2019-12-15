package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpGoodsCats implements Serializable {
    @ApiModelProperty(value = "分类id")
    private Integer catId;

    @ApiModelProperty(value = "父级id")
    private Integer parentId;

    @ApiModelProperty(value = "分类名称")
    private String catName;

    @ApiModelProperty(value = "是否显示")
    private Byte isShow;

    @ApiModelProperty(value = "分类排序")
    private Integer catSort;

    @ApiModelProperty(value = "数据标记")
    private Byte dataFlag;

    @ApiModelProperty(value = "创建时间")
    private Integer createTime;

    private static final long serialVersionUID = 1L;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Integer getCatSort() {
        return catSort;
    }

    public void setCatSort(Integer catSort) {
        this.catSort = catSort;
    }

    public Byte getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(Byte dataFlag) {
        this.dataFlag = dataFlag;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", catId=").append(catId);
        sb.append(", parentId=").append(parentId);
        sb.append(", catName=").append(catName);
        sb.append(", isShow=").append(isShow);
        sb.append(", catSort=").append(catSort);
        sb.append(", dataFlag=").append(dataFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}