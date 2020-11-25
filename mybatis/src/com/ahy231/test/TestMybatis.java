package com.ahy231.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ahy231.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.ognl.Ognl;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ahy231.pojo.Category;

public class TestMybatis {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();

		List<Category> cs = session.selectList("listCategory");
		for (Category c :
				cs) {
			System.out.println(c);
			List<Product> ps = c.getProducts();
			for (Product p :
					ps) {
				System.out.println("\t" + p);
			}
		}

		session.commit();
		session.close();
	}
}
