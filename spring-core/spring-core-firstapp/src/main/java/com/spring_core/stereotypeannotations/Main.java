package com.spring_core.stereotypeannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/stereotypeannotations/config.xml");
        Student  student = (Student)context.getBean("newstudent");
        System.out.println(student);
	}

}
