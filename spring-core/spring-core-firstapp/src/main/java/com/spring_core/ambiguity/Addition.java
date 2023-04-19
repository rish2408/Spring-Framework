package com.spring_core.ambiguity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Addition {

	private int value1;
	private int value2;
	
	public void doSum() {
		
		System.out.println(value1 + value2);
	}
}
