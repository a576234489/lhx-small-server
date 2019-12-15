package com.lhx.mall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class SpOrder implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer orderId;

    @ApiModelProperty(value = "下订单会员id")
    private Integer userId;

    @ApiModelProperty(value = "订单编号")
    private String orderNumber;

    @ApiModelProperty(value = "订单总金额")
    private BigDecimal orderPrice;

    @ApiModelProperty(value = "支付方式  0未支付 1支付宝  2微信  3银行卡")
    private String orderPay;

    @ApiModelProperty(value = "订单是否已经发货")
    private String isSend;

    @ApiModelProperty(value = "支付宝交易流水号码")
    private String tradeNo;

    @ApiModelProperty(value = "发票抬头 个人 公司")
    private String orderFapiaoTitle;

    @ApiModelProperty(value = "公司名称")
    private String orderFapiaoCompany;

    @ApiModelProperty(value = "发票内容")
    private String orderFapiaoContent;

    @ApiModelProperty(value = "订单状态： 0未付款、1已付款")
    private String payStatus;

    @ApiModelProperty(value = "记录生成时间")
    private Integer createTime;

    @ApiModelProperty(value = "记录修改时间")
    private Integer updateTime;

    @ApiModelProperty(value = "consignee收货人地址")
    private String consigneeAddr;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay;
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOrderFapiaoTitle() {
        return orderFapiaoTitle;
    }

    public void setOrderFapiaoTitle(String orderFapiaoTitle) {
        this.orderFapiaoTitle = orderFapiaoTitle;
    }

    public String getOrderFapiaoCompany() {
        return orderFapiaoCompany;
    }

    public void setOrderFapiaoCompany(String orderFapiaoCompany) {
        this.orderFapiaoCompany = orderFapiaoCompany;
    }

    public String getOrderFapiaoContent() {
        return orderFapiaoContent;
    }

    public void setOrderFapiaoContent(String orderFapiaoContent) {
        this.orderFapiaoContent = orderFapiaoContent;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

    public String getConsigneeAddr() {
        return consigneeAddr;
    }

    public void setConsigneeAddr(String consigneeAddr) {
        this.consigneeAddr = consigneeAddr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", orderPrice=").append(orderPrice);
        sb.append(", orderPay=").append(orderPay);
        sb.append(", isSend=").append(isSend);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", orderFapiaoTitle=").append(orderFapiaoTitle);
        sb.append(", orderFapiaoCompany=").append(orderFapiaoCompany);
        sb.append(", orderFapiaoContent=").append(orderFapiaoContent);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", consigneeAddr=").append(consigneeAddr);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}