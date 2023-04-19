package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.manytomany.entity.Employee;
import com.hibernate.manytomany.entity.Project;

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
        
        Employee employee1 = new Employee();
        employee1.setEmpId(1);
        employee1.setEmpName("Rishabh Srivastava");
        
        Employee employee2 = new Employee();
        employee2.setEmpId(2);
        employee2.setEmpName("Akash Jain");
        
        Project project1 = new Project();
        project1.setProjectId(11);
        project1.setProjectName("Examfactor");
        
        Project project2 = new Project();
        project2.setProjectId(22);
        project2.setProjectName("Byjus");
        // Transient State
        
        List<Employee> listOfEmployees = new ArrayList<Employee>();
        List<Project> listOfProjects = new ArrayList<Project>();
        
        listOfEmployees.add(employee1);
        listOfEmployees.add(employee2);
        
        listOfProjects.add(project1);
        listOfProjects.add(project2);
        
        employee1.setProjects(listOfProjects);
        employee2.setProjects(listOfProjects);
        project1.setEmps(listOfEmployees);
        project2.setEmps(listOfEmployees);
        
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(employee1);
        session.save(employee2);
        session.save(project1);
        session.save(project2);
        employee2.setEmpName("Vikas Kumar");
        
        // Persistent State - Session + Database
        
        transaction.commit();
        
     // Retrieve all employees using lazy loading
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.list();
        for (Employee employee : employees) {
            // Access the employee's projects to trigger lazy loading
            System.out.println(employee.getEmpName());
            System.out.println(employee.getProjects().size());
        }

        
        session.close();
        // Detached State - Session
    }
}
