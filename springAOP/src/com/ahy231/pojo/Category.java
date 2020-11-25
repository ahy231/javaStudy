/*
 * @Author: ahy231
 * @Date: 2020-11-21 22:40:54
 * @LastEditors: ahy231
 * @LastEditTime: 2020-11-21 22:42:32
 */

package com.ahy231.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private int id;
    private String name = "category 1";
}