package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SpReport3 implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "用户来源")
    private String rp3Src;

    @ApiModelProperty(value = "数量")
    private Integer rp3Count;

    private Date rp3Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp3Src() {
        return rp3Src;
    }

    public void setRp3Src(String rp3Src) {
        this.rp3Src = rp3Src;
    }

    public Integer getRp3Count() {
        return rp3Count;
    }

    public void setRp3Count(Integer rp3Count) {
        this.rp3Count = rp3Count;
    }

    public Date getRp3Date() {
        return rp3Date;
    }

    public void setRp3Date(Date rp3Date) {
        this.rp3Date = rp3Date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp3Src=").append(rp3Src);
        sb.append(", rp3Count=").append(rp3Count);
        sb.append(", rp3Date=").append(rp3Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}