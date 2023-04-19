package com.hibernate.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.onetoone.entity.Answer;
import com.hibernate.onetoone.entity.Question;

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
        
        Question question1 = new Question();
        question1.setQuestionId(1);
        question1.setQuestion("What is Java ?");
        
        Answer answer1 = new Answer();
        answer1.setAnswerId(11);
        answer1.setAnswer("Java is a Programming Language");
        answer1.setQuestion(question1);
        
        question1.setAnswer(answer1);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(question1);
        session.save(answer1);
        
        transaction.commit();
        
        Question getQuestion = (Question) session.get(Question.class, 1);
        System.out.println(getQuestion.getQuestion());
        System.out.println(getQuestion.getAnswer().getAnswer());
        
        session.close();
    }
}
