package com.cdac.crudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.crud.customException.userHandlingException;
import com.cdac.crudOperations.dao.IEnquiryRepository;
import com.cdac.crudOperations.pojos.Enquiry;
import com.cdac.crudOperations.pojos.Feedback;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class EnquiryServiceImpl implements IEnquiryService{

	@Autowired
	private IEnquiryRepository enquiryRepo;
	
	@Override
	public List<Enquiry> getEnquiry() {
		// TODO Auto-generated method stub
		return  enquiryRepo.findAll();
	}

	@Override
	public Enquiry getUserbyid(int id) {
		// TODO Auto-generated method stub

		return enquiryRepo.findById(id).orElseThrow(() -> new userHandlingException("invlid id"));
	}

	@Override
	public Enquiry
	getEnquiry(Enquiry enquiry) {
		// TODO Auto-generated method stub
		return enquiryRepo.save(enquiry);
	}

}
