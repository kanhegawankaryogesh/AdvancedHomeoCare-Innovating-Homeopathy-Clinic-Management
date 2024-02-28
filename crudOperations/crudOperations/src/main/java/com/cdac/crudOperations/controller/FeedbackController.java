package com.cdac.crudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.crudOperations.pojos.Feedback;
import com.cdac.crudOperations.service.IFeedbackService;

@RestController
@RequestMapping("/feedback")
@CrossOrigin("*")
public class FeedbackController {
	@Autowired
	private IFeedbackService feedbackService;
	@PostMapping("/addfeedback")
	public Feedback addfeedback(@RequestBody Feedback feedback)
	{
		return feedbackService.getFeedback(feedback);
	}
	
	@GetMapping("/getfeedback")
	public List<Feedback> findusers(){
		
		return feedbackService.getFeedback();
	}

}
