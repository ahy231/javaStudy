package com.how2java.pojo;

import lombok.Data;

@Data
public class Category {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
}
