package com.cdac.crudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.crudOperations.pojos.Enquiry;
import com.cdac.crudOperations.service.IEnquiryService;


@RestController
@RequestMapping("/Enquiry")
@CrossOrigin("*")
public class EnquiryController {
	
	@Autowired
	private IEnquiryService EnquiryService;
	@PostMapping("/addEnquiry")
	public Enquiry addEnquiry(@RequestBody Enquiry enquiry)
	{
		return EnquiryService.getEnquiry(enquiry);
	}
	@GetMapping("/getenquiry")
	public List<Enquiry> findusers()
	{
		return EnquiryService.getEnquiry();
	}
	

}


