package mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import pojo.Product;

import java.util.List;

public interface ProductMapper {

    @Insert("insert into product_ (name, price, cid) values (#{name}, #{price}, #{cid})")
    public int add(Product product);

    @Delete("delete from product_ where id= #{id}")
    public void delete(int id);

    @Select("select * from product_ where id= #{id}")
    public Product get(int id);

    @Update("update product_ set name=#{name} where id=#{id}")
    public int update(Product product);

    @Select("select * from product_")
    public List<Product> list();
}
