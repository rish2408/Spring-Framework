package com.spring_core.configwithoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring_core.configwithoutxml")
public class JavaConfig {

	@Bean
	public Address getAddress()
	{
		return new Address();
	}
	
	@Bean(name = {"student","newStudent"})
	public Student getStudent()
	{
		return new Student();
	}
}
