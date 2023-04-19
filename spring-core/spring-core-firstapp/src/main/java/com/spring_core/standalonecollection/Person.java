package com.spring_core.standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	private List<String> friends;
	private Map<String, String> feeStructure;
	private Properties dbProperties;
}
