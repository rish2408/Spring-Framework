package com.hibernate.pagination_sqlquery_cascading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.pagination_sqlquery_cascading.entity.Answer;
import com.hibernate.pagination_sqlquery_cascading.entity.Question;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Question question1 = new Question();
        question1.setQuestionId(1);
        question1.setQuestion("What is Java ?");
        
        Answer answer1 = new Answer();
        answer1.setAnswerId(11);
        answer1.setAnswer("Java is a Programming Language.");
        answer1.setQuestion(question1);
        
        Answer answer2 = new Answer();
        answer2.setAnswerId(12);
        answer2.setAnswer("Java contains oops concept.");
        answer2.setQuestion(question1);
        
        Answer answer3 = new Answer();
        answer3.setAnswerId(13);
        answer3.setAnswer("Java is also used to create mobile applications.");
        answer3.setQuestion(question1);
        
        List<Answer> list = new ArrayList<Answer>();
        list.add(answer1);
        list.add(answer2);
        list.add(answer3);
        
        question1.setAnswers(list);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(question1);

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
		
//		Implementing pagination using hibernate
//		Query query = session.createQuery("from Student");
//		
//		query.setFirstResult(0);
//		query.setMaxResults(5);
//		
//		List<Student> list = query.list();
//		
//		for(Student st: list)
//		{
//			System.out.println(st);
//		}
		
		// Calling Native(SQL Query) using hibernate
		
//		String query2 = "select * from student";
//		NativeQuery sqlQuery = session.createSQLQuery(query2);
//		
//		List<Object[]> list2 = sqlQuery.list();
//		
//		for(Object[] st: list2)
//		{
//			System.out.println(Arrays.toString(st));
//			System.out.println(st[4]+" : "+st[3]);
//		}
		
		transaction.commit();
		session.close();
	}
}
