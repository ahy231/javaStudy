package com.ahy231.mapper;

import com.ahy231.pojo.Product;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface ProductMapper {

    @Select("select name pname, price from product_ where id = #{id}")
    @Results({
            @Result(column = "pname", property = "name"),
            @Result(column = "price", property = "price")
    })
    public Product get(int id);
}
