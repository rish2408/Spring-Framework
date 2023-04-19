package com.hibernate.criteriaapi;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.criteriaapi.entity.Student;

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

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		
		// Add 50 Dummy Students to Database
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
		
		CriteriaQuery<Student> query = session.getCriteriaBuilder().createQuery(Student.class);
        Root<Student> root = query.from(Student.class);
//        query.select(root).where(session.getCriteriaBuilder().equal(root.get("studentCourse"), "Course 21"));
        query.select(root).where(session.getCriteriaBuilder().greaterThan(root.get("studentId").as(Integer.class), 24));
        List<Student> listOfStudent = session.createQuery(query).getResultList();

        for (Student st : listOfStudent) {
            System.out.println(st);
        }
		
		transaction.commit();
        session.close();
        
    }
}
