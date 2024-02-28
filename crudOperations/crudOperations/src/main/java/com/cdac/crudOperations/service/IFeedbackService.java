package com.cdac.crudOperations.service;

import java.util.List;

import com.cdac.crudOperations.pojos.Feedback;
import com.cdac.crudOperations.pojos.User;

public interface IFeedbackService {
	List<Feedback> getFeedback();

	Feedback getUserbyid(int id);

	Feedback getFeedback(Feedback feedback);

}
