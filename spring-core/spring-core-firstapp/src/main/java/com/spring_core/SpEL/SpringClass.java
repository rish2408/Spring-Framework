package com.spring_core.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SpringClass {

	@Value("#{20+30}")
	private int x;
	@Value("#{10+15}")
	private int y;
	
	// calling static methods 
	@Value("#{ T(java.lang.Math).sqrt(144)}")
	private double z;
	
	// calling static variables 
	@Value("#{ T(java.lang.Math).PI}")
	private double piValue;
	
	// calling created new object
	@Value("#{ new java.lang.String('Rishabh Srivastava')}")
	private String name;
	
	// calling boolean type value
	@Value("#{8-6>3}")
	private boolean isActive;
}
