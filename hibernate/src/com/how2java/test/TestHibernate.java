package com.how2java.test;
  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
import com.how2java.pojo.Product;
  
public class TestHibernate {
    /**
     * @param args
     */
    public static void main(String[] args) {
  
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
  
        Session s = sf.openSession();
        s.beginTransaction();
        Product p = new Product();
        p.setName("p1");
        System.out.println("��ʱp��˲ʱ״̬");
        s.save(p);
        System.out.println("��ʱp�ǳ־�״̬");
        s.getTransaction().commit();
        s.close();
        System.out.println("��ʱp���ѹ�״̬");
        sf.close();
    }
  
}