package com.how2java.pojo;

import lombok.Data;

@Data
public class Product {
    private int id;
    private String name;
    private float price;
    private int cid;
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", cid=" + cid +
                '}' + "\t对应的分类是：\t" +
                category.getName();
    }
}
