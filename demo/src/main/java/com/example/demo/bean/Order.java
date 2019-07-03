package com.example.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    private int Id;
    private String OrderId;
    private BigDecimal Amount;
    private Date CreateTime;

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", OrderId='" + OrderId + '\'' +
                ", Amount=" + Amount +
                ", CreateTime=" + CreateTime +
                '}';
    }

//    public Order(int id, String orderId, BigDecimal amount, Time createTime) {
//        Id = id;
//        OrderId = orderId;
//        Amount = amount;
//        CreateTime = createTime;
//    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }
}
