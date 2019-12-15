package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SpReport1 implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户数")
    private Integer rp1UserCount;

    @ApiModelProperty(value = "地区")
    private String rp1Area;

    private Date rp1Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRp1UserCount() {
        return rp1UserCount;
    }

    public void setRp1UserCount(Integer rp1UserCount) {
        this.rp1UserCount = rp1UserCount;
    }

    public String getRp1Area() {
        return rp1Area;
    }

    public void setRp1Area(String rp1Area) {
        this.rp1Area = rp1Area;
    }

    public Date getRp1Date() {
        return rp1Date;
    }

    public void setRp1Date(Date rp1Date) {
        this.rp1Date = rp1Date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp1UserCount=").append(rp1UserCount);
        sb.append(", rp1Area=").append(rp1Area);
        sb.append(", rp1Date=").append(rp1Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}