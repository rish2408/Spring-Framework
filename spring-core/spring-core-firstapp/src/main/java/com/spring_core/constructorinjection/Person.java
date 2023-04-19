package com.spring_core.constructorinjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private int personId;
	private String personName;
	private Certificate personCertificate;
}
