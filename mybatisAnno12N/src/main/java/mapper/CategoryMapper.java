package mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import pojo.Category;

import java.util.List;

public interface CategoryMapper {

    @Select("select * from category_")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "products", javaType = List.class, column = "id", many =
            @Many(select = "mapper.ProductMapper.listByCategory"))
    })
    public List<Category> list();
}
