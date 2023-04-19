package com.spring_core.lifecyclemethodbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements InitializingBean, DisposableBean{

	private int empId;
	private String empName;

//	Implementing Life Cycle method of bean using Interface
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init block for Employee");
		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy block for Employee");
		
	}
}
