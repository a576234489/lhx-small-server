package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SpReport2 implements Serializable {
    private Integer id;

    private String rp2Page;

    private Integer rp2Count;

    private Date rp2Date;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRp2Page() {
        return rp2Page;
    }

    public void setRp2Page(String rp2Page) {
        this.rp2Page = rp2Page;
    }

    public Integer getRp2Count() {
        return rp2Count;
    }

    public void setRp2Count(Integer rp2Count) {
        this.rp2Count = rp2Count;
    }

    public Date getRp2Date() {
        return rp2Date;
    }

    public void setRp2Date(Date rp2Date) {
        this.rp2Date = rp2Date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rp2Page=").append(rp2Page);
        sb.append(", rp2Count=").append(rp2Count);
        sb.append(", rp2Date=").append(rp2Date);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}