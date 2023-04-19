package com.spring_core.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/referencetype/config.xml");
        A  a1 = (A)context.getBean("aclass1");
        System.out.println(a1.getX());
        System.out.println(a1.getObj().getY());
        A  a2 = (A)context.getBean("aclass2");
        System.out.println(a2.getX());
        System.out.println(a2.getObj().getY());

	}

}
