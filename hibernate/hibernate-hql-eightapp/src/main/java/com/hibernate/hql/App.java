package com.hibernate.hql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.hql.entity.Answer;
import com.hibernate.hql.entity.Employee;
import com.hibernate.hql.entity.Question;

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
        
//        Employee employee1 = new Employee();
//        employee1.setEmpId(1);
//        employee1.setEmpName("Rishabh Srivastava");
//        
//        Employee employee2 = new Employee();
//        employee2.setEmpId(2);
//        employee2.setEmpName("Akash Jain");
//        
//        Project project1 = new Project();
//        project1.setProjectId(11);
//        project1.setProjectName("Examfactor");
//        
//        Project project2 = new Project();
//        project2.setProjectId(22);
//        project2.setProjectName("Byjus");
//        // Transient State
//        
//        List<Employee> listOfEmployees = new ArrayList<Employee>();
//        List<Project> listOfProjects = new ArrayList<Project>();
//        
//        listOfEmployees.add(employee1);
//        listOfEmployees.add(employee2);
//        
//        listOfProjects.add(project1);
//        listOfProjects.add(project2);
//        
//        employee1.setProjects(listOfProjects);
//        employee2.setProjects(listOfProjects);
//        project1.setEmps(listOfEmployees);
//        project2.setEmps(listOfEmployees);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(question1);
        session.save(answer1);
        session.save(answer2);
        session.save(answer3);
        
//        session.save(employee1);
//        session.save(employee2);
//        session.save(project1);
//        session.save(project2);
//        employee2.setEmpName("Vikas Kumar");
        
        // Persistent State - Session + Database
        
        
        
     // Retrieve all employees using hql
//        Query<Employee> query = session.createQuery("from Employee where empName = :x", Employee.class);
//        query.setParameter("x", "Rishabh Srivastava");
//        List<Employee> employees = query.list();
//        for (Employee employee : employees) {
//            // Access the employee's projects to trigger lazy loading
//            System.out.println(employee.getEmpName());
//            System.out.println(employee.getProjects().size());
//        }
        
      // Delete employee using hql
//        Query query2 = session.createQuery("delete from Employee where empName = :x");
//        query2.setParameter("x", "Rishabh Srivastava");
//        int deleteCount = query2.executeUpdate();
//        System.out.println("Deleted : "+deleteCount);
        
        // Update employee using hql
//        Query query3 = session.createQuery("update Employee set empName = :x where empName=:n");
//        query3.setParameter("x", "Krishna Srivastava");
//        query3.setParameter("n", "Vikas Kumar");
//        int updateCount = query3.executeUpdate();
//        System.out.println("Updated : "+updateCount);
        
        // Join query using hql
        Query query4 = session.createQuery("select q.question, q.questionId, a.answer from Question as q INNER JOIN q.answers as a");
        List<Object[]> resultList = query4.getResultList();
        
        for(Object[] arr:resultList)
        {
        	System.out.println(Arrays.toString(arr));
        }
        
        
        transaction.commit();
        session.close();
        // Detached State - Session
    }
}
