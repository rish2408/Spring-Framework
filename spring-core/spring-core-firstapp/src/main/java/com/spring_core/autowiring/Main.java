package com.spring_core.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/autowiring/config.xml");
        Employee  employee1 = (Employee)context.getBean("employee1");
        System.out.println(employee1);
//        Employee  employee2 = (Employee)context.getBean("employee2");
//        System.out.println(employee2);
        
        Student  student1 = (Student)context.getBean("student1");
        System.out.println(student1);
        context.registerShutdownHook();
	}

}
