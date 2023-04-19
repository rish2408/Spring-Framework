package com.spring_core.configwithoutxml;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@Value("Hazratganj")
	private String street;
	@Value("Lucknow")
	private String city;
	
	public void myAddress()
	{
		System.out.println("MyAddress");
	}
	
}
