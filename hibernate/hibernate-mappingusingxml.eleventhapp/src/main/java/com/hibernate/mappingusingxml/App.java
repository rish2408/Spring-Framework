package com.hibernate.mappingusingxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.mappingusingxml.entity.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Person person1 = new Person(1, "Ram", "Ayodhya", "9252654526");
        
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(person1);
		
		transaction.commit();
		session.close();
    }
}
