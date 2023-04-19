package com.spring_jdbc_withoutxmlconfig_thirdapp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_jdbc_withoutxmlconfig_thirdapp.config.JdbcConfig;
import com.spring_jdbc_withoutxmlconfig_thirdapp.entity.Student;
import com.spring_jdbc_withoutxmlconfig_thirdapp.services.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
         
         
//       JdbcTemplate  jdbcTemplate = (JdbcTemplate)context.getBean("jdbcTemplate");
       
//       // Insert Query
//       String query = "insert into student(id,name,city) values(?,?,?)";
//       
//       // Fire Query
//       int noOfRecords = jdbcTemplate.update(query, 222,"Mansi Soni","Noida");
//       System.out.println("Number of Record Inserted : "+noOfRecords);
       
       StudentService studentService = (StudentService)context.getBean("studentService");
//       Student st = new Student();
//       st.setId(333);
//       st.setName("Akshay Kumar");
//       st.setCity("Canada");
//       
//       int insertStudent = studentService.insertStudent(st);
//       System.out.println("Number of Record Inserted : "+insertStudent);
       
//       Student st2 = new Student();
//       st2.setId(333);
//       st2.setName("Vikas Kumar");
//       st2.setCity("Etawah");
//       
//       int updateStudent = studentService.updateStudent(st2);
//       System.out.println("Number of Record Updated : "+updateStudent);
     
//       int deleteStudent = studentService.deleteStudent(333);
//       System.out.println("Number of Record Deleted : "+deleteStudent);
       
       Student student = studentService.getStudent(222);
       System.out.println(student);
       
       List<Student> allStudents = studentService.getAllStudents();
       for(Student st: allStudents)
       {
       	System.out.println(st);
       }
       
    }
}
