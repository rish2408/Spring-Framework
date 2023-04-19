package com.spring_core.springbeanscope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("newstudent")
@Scope("prototype")
public class Student {

	@Value("1")
	private int studentId;
	@Value("Abhinav Verma")
	private String studentName;
	@Value("#{allcities}")
	private List<String> cities;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Student(int studentId, String studentName, List<String> cities) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.cities = cities;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
