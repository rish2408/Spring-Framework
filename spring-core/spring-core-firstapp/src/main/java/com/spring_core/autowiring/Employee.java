package com.spring_core.autowiring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private int empId;
	private String empName;
	private Address empAddress;
	
	
}
