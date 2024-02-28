package com.cdac.crudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.crud.customException.userHandlingException;
import com.cdac.crudOperations.dao.PatientHistoryRepository;
import com.cdac.crudOperations.pojos.PatientHistory;

import jakarta.transaction.Transactional;

@Service
@Transactional


public class PatientHistoryServiceImpl implements IPatientHistoryService{

	@Autowired
	private PatientHistoryRepository Patientrepo;
	@Override
	public List<PatientHistory> getHistory() {
		
		return Patientrepo.findAll();
	}

	@Override
	public PatientHistory getUserbyid(int id) {
		// TODO Auto-generated method stub
		return Patientrepo.findById(id).orElseThrow(() -> new userHandlingException("invlid id"));
	}

	@Override
	public PatientHistory getHistory(PatientHistory Patienthistory) {
		
		return Patientrepo.save(Patienthistory) ;
	}

}
