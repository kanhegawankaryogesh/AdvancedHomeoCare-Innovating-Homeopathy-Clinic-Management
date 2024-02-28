package com.cdac.crudOperations.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Feedback")
public class Feedback {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String name;
    private String email;
    private String feedbackText;
    
    public Feedback() {
		// TODO Auto-generated constructor stub
	}

	public Feedback(String name, String email, String feedbackText) {
		super();
		this.name = name;
		this.email = email;
		this.feedbackText = feedbackText;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedbackText() {
		return feedbackText;
	}

	public void setFeedbackText(String feedbackText) {
		this.feedbackText = feedbackText;
	}

	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", feedbackText=" + feedbackText + "]";
	}
	

   
}
