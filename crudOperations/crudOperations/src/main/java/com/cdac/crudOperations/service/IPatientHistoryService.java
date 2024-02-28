package com.cdac.crudOperations.service;

import java.util.List;

import com.cdac.crudOperations.pojos.PatientHistory;

public interface IPatientHistoryService {
	
	List<PatientHistory> getHistory();
	
	PatientHistory getUserbyid(int id);
	
	PatientHistory getHistory(PatientHistory Patienthistory);
}
