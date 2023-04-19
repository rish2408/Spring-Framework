package com.spring_jdbc_withoutxmlconfig_thirdapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring_jdbc_withoutxmlconfig_thirdapp.entity.Student;

@Component("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertStudent(Student student) {

		String query = "insert into student(id,name,city) values(?,?,?)";
		int noOfRecords = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return noOfRecords;
	}
	
	public int updateStudent(Student student) {
		
		String query = "update student set name=?, city=? where id=?";
		int noOfRecords = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return noOfRecords;
	}
	
	public int deleteStudent(int studentId) {
		String query = "delete from student where id=?";
		int noOfRecords = this.jdbcTemplate.update(query, studentId);
		return noOfRecords;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student singleStudent = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return singleStudent;
	}

	public List<Student> getAllStudents() {
		String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> listOfStudent = this.jdbcTemplate.query(query, rowMapper);
		return listOfStudent;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
