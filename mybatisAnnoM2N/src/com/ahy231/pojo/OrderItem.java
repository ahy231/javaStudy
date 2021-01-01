package com.ahy231.pojo;

import lombok.Data;

@Data
public class OrderItem {
//    private int id;
//    private int oid;
//    private int pid;
    private int number;
    private Product product;

    public int getNumber() {
        return number;
    }

    public Product getProduct() {
        return product;
    }
}
