package com.spring_jdbc_withoutxmlconfig_thirdapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring_jdbc_withoutxmlconfig_thirdapp.services.StudentService;
import com.spring_jdbc_withoutxmlconfig_thirdapp.services.StudentServiceImpl;

@Configuration
@ComponentScan(basePackages = "com.spring_jdbc_withoutxmlconfig_thirdapp.services")
public class JdbcConfig {

	@Bean(name = "ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean(name = "jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean(name = "studentService")
//	public StudentService getStudentService()
//	{
//		StudentServiceImpl studentService = new StudentServiceImpl();
//		studentService.setJdbcTemplate(getTemplate());
//		return studentService;
//	}
	
}
