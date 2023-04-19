package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.cache.secondlevelcache.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

//		 Add 50 Dummy Students to Database

//		for (int i = 1; i <= 50; i++) {
//			Student student = new Student();
//			student.setStudentId(i);
//			student.setStudentName("Student " + i);
//			student.setStudentCourse("Course " + i);
//			student.setStudentDuration("Duration " + i);
//			student.setStudentCity("City " + i);
//
//			session.save(student);
//		}

//		First Level Cache using session

//		Student student = session.get(Student.class, 24);
//		System.out.println(student);
//
//		System.out.println("Working on some other code");
//
//		Student student2 = session.get(Student.class, 24);
//		System.out.println(student2);
//
//		System.out.println(session.contains(student2));
//
//		transaction.commit();
//		session.close();

//		Second Level Cache using session
		
		Session session1 = sessionFactory.openSession();

		Student student = session1.get(Student.class, 24);
		System.out.println(student);
		
		session1.close();

		System.out.println("Working on some other code");
		
		Session session2 = sessionFactory.openSession();

		Student student2 = session2.get(Student.class, 24);
		System.out.println(student2);
		
		session2.close();

	}
}
