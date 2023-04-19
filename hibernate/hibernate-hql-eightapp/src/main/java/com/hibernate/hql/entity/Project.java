package com.hibernate.hql.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
public class Project {

	@Id
	private int projectId;
	private String projectName;
	@ManyToMany(mappedBy = "projects", fetch = FetchType.EAGER)
	private List<Employee> emps;
}
