package com.ahy231.pojo;

import lombok.Data;

@Data
public class Product {
//    private int id;
    private String name;
    private float price;
//    private int cid;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
