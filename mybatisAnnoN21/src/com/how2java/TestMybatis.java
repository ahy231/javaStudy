package com.how2java;

import com.how2java.mapper.ProductMapper;
import com.how2java.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        ProductMapper mapper = session.getMapper(ProductMapper.class);

        listProducts(mapper);

        session.commit();
        session.close();
    }

    public static void listProducts(ProductMapper mapper) {
        List<Product> products = mapper.listProducts();
        for (Product p :
                products) {
            System.out.println(p);
        }
    }
}
