package edu.ap.spring.jpa;

import javax.persistence.Entity;

@Entity
public class Question {

	public String identifier;
	public String askedquestion;
	public Question(String string, String string2) {
		identifier = string;
		askedquestion = string2;
	}

	public String getAnswer() {
		return "test";
	}
}
