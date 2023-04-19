package com.spring_core.lifecyclemethodbean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private int studentId;
	private String studentName;
	
	
//	Implementing Life Cycle method of bean using XML
	
	public void init() {
		System.out.println("Inside init block for Student");
	}
	
	public void destroy() {
		System.out.println("Inside destroy block for Student");
	}
}
