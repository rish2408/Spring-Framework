package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.onetomany.entity.Answer;
import com.hibernate.onetomany.entity.Question;

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
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);
        
        transaction.commit();
        
        Question getQuestion = (Question) session.get(Question.class, 1);
        System.out.println(getQuestion.getQuestion());
        for(Answer ans: getQuestion.getAnswers())
        {
        	System.out.println(ans.getAnswer());
        }
        
        session.close();
    }
}
