package com.hibernate.pagination_sqlquery_cascading.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private String studentCourse;
	private String studentDuration;
	private String studentCity;
	
}
