package com.ahy231.mapper;

import com.ahy231.pojo.Order;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper {

    @Select("select * from order_")
    @Results({
            @Result(property = "code", column = "code"),
            @Result(property = "orderItems", column = "id", javaType = List.class, many = @Many(select = "com.ahy231.mapper.OrderItemMapper.listByOrder"))
    })
    public List<Order> list();
}
