package com.ahy231.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ahy231.p1.Category;

public class PracticeHibernate {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session s = sf.openSession();
		s.beginTransaction();
		
		Category c = new Category();
		c.setName("分类1");
		s.save(c);
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
