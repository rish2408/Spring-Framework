package com.spring_core.springbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/springbeanscope/config.xml");
		Student student = (Student) context.getBean("newstudent");
		System.out.println(student.hashCode());
		Student student2 = (Student) context.getBean("newstudent");
		System.out.println(student2.hashCode());

		Teacher teacher1 = (Teacher)context.getBean("teacher");
		System.out.println(teacher1.hashCode()); 
		Teacher teacher2 = (Teacher)context.getBean("teacher"); 
		System.out.println(teacher2.hashCode());
		 
	}

}
