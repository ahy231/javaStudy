package com.ahy231.mapper;

import com.ahy231.pojo.OrderItem;
import com.ahy231.pojo.Product;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderItemMapper {

    @Select("select pid, number from order_item_ where oid = #{oid}")
    @Results({
            @Result(property = "product", column = "pid", javaType = Product.class, one = @One(select = "com.ahy231.mapper.ProductMapper.get")),
            @Result(property = "number", column = "number")
    })
    public List<OrderItem> listByOrder(int oid);
}
