package com.how2java.mapper;

import com.how2java.CategoryDynaSqlProvider;
import com.how2java.pojo.Category;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

public interface CategoryMapper {

    @InsertProvider(type = CategoryDynaSqlProvider.class, method = "add")
    public int add(Category category);

    @DeleteProvider(type = CategoryDynaSqlProvider.class, method = "delete")
    public void delete(int id);

    @SelectProvider(type = CategoryDynaSqlProvider.class, method = "get")
    public Category get(int id);

    @UpdateProvider(type = CategoryDynaSqlProvider.class, method = "update")
    public int update(Category category);

    @SelectProvider(type = CategoryDynaSqlProvider.class, method = "list")
    public List<Category> list();
}
