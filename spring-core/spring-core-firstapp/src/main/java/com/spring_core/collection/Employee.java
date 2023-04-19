package com.spring_core.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {

	private String empName;
	private List<String> empPhones;
	private Set<String> empAddresses;
	private Map<String, String> empCourses;
	private Properties dbProperties;
}
