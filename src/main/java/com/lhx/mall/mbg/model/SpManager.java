package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpManager implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer mgId;

    @ApiModelProperty(value = "名称")
    private String mgName;

    @ApiModelProperty(value = "密码")
    private String mgPwd;

    @ApiModelProperty(value = "注册时间")
    private Integer mgTime;

    @ApiModelProperty(value = "角色id")
    private Byte roleId;

    private String mgMobile;

    private String mgEmail;

    @ApiModelProperty(value = "1：表示启用 0:表示禁用")
    private Byte mgState;

    private static final long serialVersionUID = 1L;

    public Integer getMgId() {
        return mgId;
    }

    public void setMgId(Integer mgId) {
        this.mgId = mgId;
    }

    public String getMgName() {
        return mgName;
    }

    public void setMgName(String mgName) {
        this.mgName = mgName;
    }

    public String getMgPwd() {
        return mgPwd;
    }

    public void setMgPwd(String mgPwd) {
        this.mgPwd = mgPwd;
    }

    public Integer getMgTime() {
        return mgTime;
    }

    public void setMgTime(Integer mgTime) {
        this.mgTime = mgTime;
    }

    public Byte getRoleId() {
        return roleId;
    }

    public void setRoleId(Byte roleId) {
        this.roleId = roleId;
    }

    public String getMgMobile() {
        return mgMobile;
    }

    public void setMgMobile(String mgMobile) {
        this.mgMobile = mgMobile;
    }

    public String getMgEmail() {
        return mgEmail;
    }

    public void setMgEmail(String mgEmail) {
        this.mgEmail = mgEmail;
    }

    public Byte getMgState() {
        return mgState;
    }

    public void setMgState(Byte mgState) {
        this.mgState = mgState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mgId=").append(mgId);
        sb.append(", mgName=").append(mgName);
        sb.append(", mgPwd=").append(mgPwd);
        sb.append(", mgTime=").append(mgTime);
        sb.append(", roleId=").append(roleId);
        sb.append(", mgMobile=").append(mgMobile);
        sb.append(", mgEmail=").append(mgEmail);
        sb.append(", mgState=").append(mgState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}