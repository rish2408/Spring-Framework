package com.hibernate.pagination_sqlquery_cascading.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Question {

	@Id
	private int questionId;
	private String question;
	@OneToMany(mappedBy = "question",cascade = CascadeType.ALL)
	private List<Answer> answers;
}
