package com.hibernate.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class Answer {

	@Id
	private int answerId;
	private String answer;
	@OneToOne(mappedBy = "answer")
	@JoinColumn(name = "q_id")
	private Question question;
}
