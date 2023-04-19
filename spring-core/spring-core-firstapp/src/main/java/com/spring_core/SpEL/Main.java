package com.spring_core.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring_core/SpEL/config.xml");
		SpringClass springexpression = (SpringClass) context.getBean("springClass");
		System.out.println(springexpression);
		
//		Using Spring Expression Language Parser
		
		SpelExpressionParser value = new SpelExpressionParser();
		Expression expression = value.parseExpression("10+20");
		System.out.println(expression.getValue());
		 
	}

}
