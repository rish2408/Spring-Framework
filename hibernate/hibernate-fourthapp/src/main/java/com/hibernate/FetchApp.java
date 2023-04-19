package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Student;

public class FetchApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Student student = (Student) session.get(Student.class, 111);
		System.out.println(student);
		
		Address address = (Address) session.load(Address.class, 1);
		System.out.println(address);
		
		Address address2 = (Address) session.load(Address.class, 1);
		System.out.println(address2);
		
		sessionFactory.close();
	}
}
