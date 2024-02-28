package com.cdac.crudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.crud.customException.userHandlingException;
import com.cdac.crudOperations.dao.FeedbackRepository;
import com.cdac.crudOperations.dao.IUserRepository;
import com.cdac.crudOperations.pojos.Feedback;
import com.cdac.crudOperations.pojos.User;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FeedbackService implements IFeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepo;

	@Override
	public List<Feedback> getFeedback() {
		// TODO Auto-generated method stub
		return feedbackRepo.findAll();
	}

	@Override
	public Feedback getUserbyid(int id) {

		return feedbackRepo.findById(id).orElseThrow(() -> new userHandlingException("invlid id"));
	}

	@Override
	public Feedback getFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return feedbackRepo.save(feedback);
	}

}
