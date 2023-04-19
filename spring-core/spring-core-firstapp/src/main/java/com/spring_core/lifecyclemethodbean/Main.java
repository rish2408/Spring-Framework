package com.spring_core.lifecyclemethodbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/lifecyclemethodbean/config.xml");
        Student  student1 = (Student)context.getBean("student1");
        System.out.println(student1);
        Employee  employee1 = (Employee)context.getBean("employee1");
        System.out.println(employee1);
        Person  person1 = (Person)context.getBean("person1");
        System.out.println(person1);
        context.registerShutdownHook();
	}

}
