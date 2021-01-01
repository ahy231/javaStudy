package com.ahy231.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Order {
//    private int id;
    private String code;
    private List<OrderItem> orderItems;

    public String getCode() {
        return code;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
