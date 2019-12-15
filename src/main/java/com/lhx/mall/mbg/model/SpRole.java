package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpRole implements Serializable {
    private Short roleId;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "权限ids,1,2,5")
    private String psIds;

    @ApiModelProperty(value = "控制器-操作,控制器-操作,控制器-操作")
    private String psCa;

    private String roleDesc;

    private static final long serialVersionUID = 1L;

    public Short getRoleId() {
        return roleId;
    }

    public void setRoleId(Short roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPsIds() {
        return psIds;
    }

    public void setPsIds(String psIds) {
        this.psIds = psIds;
    }

    public String getPsCa() {
        return psCa;
    }

    public void setPsCa(String psCa) {
        this.psCa = psCa;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", psIds=").append(psIds);
        sb.append(", psCa=").append(psCa);
        sb.append(", roleDesc=").append(roleDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}