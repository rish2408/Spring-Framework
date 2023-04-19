package com.spring_core.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("newstudent")
public class Student {

	@Value("1")
	private int studentId;
	@Value("Abhinav Verma")
	private String studentName;
	@Value("#{allcities}")
	private List<String> cities;
	
}
