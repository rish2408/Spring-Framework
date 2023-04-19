package com.hibernate.mappingusingxml.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

	private int id;
	private String name;
	private String address;
	private String phone;
	
}
