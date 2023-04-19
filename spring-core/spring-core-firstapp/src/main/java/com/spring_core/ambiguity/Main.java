package com.spring_core.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/ambiguity/config.xml");
        Addition addition1 = (Addition)context.getBean("first_addition");
        addition1.doSum();

	}

}
