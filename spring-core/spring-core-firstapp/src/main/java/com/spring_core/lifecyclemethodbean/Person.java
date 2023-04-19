package com.spring_core.lifecyclemethodbean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private int personId;
	private String personName;
	
//	Implementing Life Cycle method of bean using Annotation
	
	@PostConstruct
	public void init()
	{
		System.out.println("Inside init block for Person");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Inside destroy block for Person");
	}
}
