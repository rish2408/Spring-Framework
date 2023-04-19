package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.Certificate;
import com.hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//        System.out.println(sessionFactory);
//        System.out.println(sessionFactory.isClosed());
        
        
        Student st = new Student(111, "Rishabh", "Lucknow", new Certificate("Spring Development", "12 Months"));
        System.out.println(st);
        
        // Reading Image and Setting to the Database
        
        FileInputStream fis = new FileInputStream("src/main/java/Rishabh.jpg");
        byte[] imageByteData = new byte[fis.available()];
        fis.read(imageByteData);
        
        Address ad = new Address(11, "Naka", "Lucknow", true, 12.33, new Date(), imageByteData);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        transaction.commit();
        session.close();
    }
}
