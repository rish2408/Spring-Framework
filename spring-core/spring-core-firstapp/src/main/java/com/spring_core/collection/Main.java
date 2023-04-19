package com.spring_core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/collection/config.xml");
        Employee  employee1 = (Employee)context.getBean("employee1");
        System.out.println(employee1);
	}

}
