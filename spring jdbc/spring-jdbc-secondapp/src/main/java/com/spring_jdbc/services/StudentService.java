package com.spring_jdbc.services;

import java.util.List;

import com.spring_jdbc.entity.Student;

public interface StudentService {

	public int insertStudent(Student student);
	
	public int updateStudent(Student student);
	
	public int deleteStudent(int studentId);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
	
}
