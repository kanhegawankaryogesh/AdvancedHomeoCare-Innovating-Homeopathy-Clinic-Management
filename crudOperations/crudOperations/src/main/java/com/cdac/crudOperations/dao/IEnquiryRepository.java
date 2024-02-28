package com.cdac.crudOperations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.crudOperations.pojos.Enquiry;
import com.cdac.crudOperations.pojos.Feedback;

public interface IEnquiryRepository extends JpaRepository<Enquiry, Integer>{

}
