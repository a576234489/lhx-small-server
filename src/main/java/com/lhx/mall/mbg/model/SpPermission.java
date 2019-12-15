package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpPermission implements Serializable {
    private Short psId;

    @ApiModelProperty(value = "权限名称")
    private String psName;

    @ApiModelProperty(value = "父id")
    private Short psPid;

    @ApiModelProperty(value = "控制器")
    private String psC;

    @ApiModelProperty(value = "操作方法")
    private String psA;

    @ApiModelProperty(value = "权限等级")
    private String psLevel;

    private static final long serialVersionUID = 1L;

    public Short getPsId() {
        return psId;
    }

    public void setPsId(Short psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName;
    }

    public Short getPsPid() {
        return psPid;
    }

    public void setPsPid(Short psPid) {
        this.psPid = psPid;
    }

    public String getPsC() {
        return psC;
    }

    public void setPsC(String psC) {
        this.psC = psC;
    }

    public String getPsA() {
        return psA;
    }

    public void setPsA(String psA) {
        this.psA = psA;
    }

    public String getPsLevel() {
        return psLevel;
    }

    public void setPsLevel(String psLevel) {
        this.psLevel = psLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", psId=").append(psId);
        sb.append(", psName=").append(psName);
        sb.append(", psPid=").append(psPid);
        sb.append(", psC=").append(psC);
        sb.append(", psA=").append(psA);
        sb.append(", psLevel=").append(psLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}