package com.how2java;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;
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

        CategoryMapper mapper = session.getMapper(CategoryMapper.class);

//        add(mapper);
//        delete(mapper);
//        get(mapper);
//        update(mapper);
        listAll(mapper);

        session.commit();
        session.close();
    }

    public static void update(CategoryMapper mapper) {
        Category c = mapper.get(14);
        c.setName("修改了的Category名称");
        mapper.update(c);
        listAll(mapper);
    }

    public static void get(CategoryMapper mapper) {
        Category c = mapper.get(14);
        System.out.println(c.getName());
    }

    public static void delete(CategoryMapper mapper) {
        mapper.delete(13);
        listAll(mapper);
    }

    public static void add(CategoryMapper mapper) {
        Category c = new Category();
        c.setName("新增加的Category");
        mapper.add(c);
        listAll(mapper);
    }

    public static void listAll(CategoryMapper mapper) {
        List<Category> categories = mapper.list();
        for (Category c :
                categories) {
            System.out.println(c.getName());
        }
    }
}
