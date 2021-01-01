package com.how2java.mapper;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {

    @Select("select * from product_")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "category", javaType = Category.class,
            column = "cid", one = @One(select = "com.how2java.mapper.CategoryMapper.get"))
    })
    public List<Product> listProducts();
}
