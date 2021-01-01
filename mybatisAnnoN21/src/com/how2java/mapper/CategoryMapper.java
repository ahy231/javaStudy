package com.how2java.mapper;

import com.how2java.pojo.Category;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {

    @Select("select * from category_ where id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name")
    })
    public Category get(int id);
}
