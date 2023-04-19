package com.spring_core.configwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student student = (Student)context.getBean("student");
        Student student = (Student)context.getBean("student");
        System.out.println(student);
        student.study();
        student.getAddress().myAddress();

	}

}
