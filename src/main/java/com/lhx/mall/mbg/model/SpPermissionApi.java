package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class SpPermissionApi implements Serializable {
    private Integer id;

    private Integer psId;

    private String psApiService;

    private String psApiAction;

    private String psApiPath;

    private Integer psApiOrder;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsApiService() {
        return psApiService;
    }

    public void setPsApiService(String psApiService) {
        this.psApiService = psApiService;
    }

    public String getPsApiAction() {
        return psApiAction;
    }

    public void setPsApiAction(String psApiAction) {
        this.psApiAction = psApiAction;
    }

    public String getPsApiPath() {
        return psApiPath;
    }

    public void setPsApiPath(String psApiPath) {
        this.psApiPath = psApiPath;
    }

    public Integer getPsApiOrder() {
        return psApiOrder;
    }

    public void setPsApiOrder(Integer psApiOrder) {
        this.psApiOrder = psApiOrder;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", psId=").append(psId);
        sb.append(", psApiService=").append(psApiService);
        sb.append(", psApiAction=").append(psApiAction);
        sb.append(", psApiPath=").append(psApiPath);
        sb.append(", psApiOrder=").append(psApiOrder);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}