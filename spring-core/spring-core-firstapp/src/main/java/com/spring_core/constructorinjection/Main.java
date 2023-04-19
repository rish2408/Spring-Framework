package com.spring_core.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/constructorinjection/config.xml");
        Person person1 = (Person)context.getBean("person1");
        System.out.println(person1);
        Person person2 = (Person)context.getBean("person2");
        System.out.println(person2);

	}

}
