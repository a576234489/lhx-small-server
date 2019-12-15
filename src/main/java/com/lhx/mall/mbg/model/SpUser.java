package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpUser implements Serializable {
    @ApiModelProperty(value = "自增id")
    private Integer userId;

    @ApiModelProperty(value = "登录名")
    private String username;

    @ApiModelProperty(value = "qq官方唯一编号信息")
    private String qqOpenId;

    @ApiModelProperty(value = "登录密码")
    private String password;

    @ApiModelProperty(value = "邮箱")
    private String userEmail;

    @ApiModelProperty(value = "新用户注册邮件激活唯一校验码")
    private String userEmailCode;

    @ApiModelProperty(value = "新用户是否已经通过邮箱激活帐号")
    private String isActive;

    @ApiModelProperty(value = "性别")
    private String userSex;

    @ApiModelProperty(value = "qq")
    private String userQq;

    @ApiModelProperty(value = "手机")
    private String userTel;

    @ApiModelProperty(value = "学历")
    private String userXueli;

    @ApiModelProperty(value = "爱好")
    private String userHobby;

    @ApiModelProperty(value = "创建时间")
    private Integer createTime;

    @ApiModelProperty(value = "修改时间")
    private Integer updateTime;

    @ApiModelProperty(value = "简介")
    private String userIntroduce;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQqOpenId() {
        return qqOpenId;
    }

    public void setQqOpenId(String qqOpenId) {
        this.qqOpenId = qqOpenId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmailCode() {
        return userEmailCode;
    }

    public void setUserEmailCode(String userEmailCode) {
        this.userEmailCode = userEmailCode;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserQq() {
        return userQq;
    }

    public void setUserQq(String userQq) {
        this.userQq = userQq;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserXueli() {
        return userXueli;
    }

    public void setUserXueli(String userXueli) {
        this.userXueli = userXueli;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
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

    public String getUserIntroduce() {
        return userIntroduce;
    }

    public void setUserIntroduce(String userIntroduce) {
        this.userIntroduce = userIntroduce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", qqOpenId=").append(qqOpenId);
        sb.append(", password=").append(password);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userEmailCode=").append(userEmailCode);
        sb.append(", isActive=").append(isActive);
        sb.append(", userSex=").append(userSex);
        sb.append(", userQq=").append(userQq);
        sb.append(", userTel=").append(userTel);
        sb.append(", userXueli=").append(userXueli);
        sb.append(", userHobby=").append(userHobby);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userIntroduce=").append(userIntroduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}