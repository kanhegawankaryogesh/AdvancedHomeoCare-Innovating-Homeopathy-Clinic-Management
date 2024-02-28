package com.cdac.crudOperations.service;

import java.util.List;

import com.cdac.crudOperations.pojos.Enquiry;


public interface IEnquiryService {
	List<Enquiry> getEnquiry();

	Enquiry getUserbyid(int id);

	Enquiry getEnquiry(Enquiry enquiry);

}
