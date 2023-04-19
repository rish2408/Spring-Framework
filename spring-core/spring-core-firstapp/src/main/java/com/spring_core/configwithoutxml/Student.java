package com.spring_core.configwithoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
//@Component
public class Student {

	@Autowired
	private Address address;
	public void study()
	{
		System.out.println("Student is reading book");
	}
}
