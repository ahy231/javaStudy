package com.ahy231;

import com.ahy231.mapper.OrderMapper;
import com.ahy231.pojo.Order;
import com.ahy231.pojo.OrderItem;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        OrderMapper mapper = session.getMapper(OrderMapper.class);

        listOrders(mapper);

        session.commit();
        session.close();
    }

    public static void listOrders(OrderMapper mapper) {
        for (Order o :
                mapper.list()) {
            System.out.println(o.getCode());
            for (OrderItem o1:
                 o.getOrderItems()) {
                System.out.println("\t" + o1.getProduct().getName() + "\t" + o1.getProduct().getPrice() + "\t" + o1.getNumber());
            }
        }
    }
}
