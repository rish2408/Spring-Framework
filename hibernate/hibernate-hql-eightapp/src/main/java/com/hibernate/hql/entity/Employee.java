package com.hibernate.hql.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
public class Employee {

	@Id
	private int empId;
	private String empName;
	@ManyToMany
	@JoinTable(name = "employee_project",
				joinColumns = {@JoinColumn(name="eid")},
				inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
}
