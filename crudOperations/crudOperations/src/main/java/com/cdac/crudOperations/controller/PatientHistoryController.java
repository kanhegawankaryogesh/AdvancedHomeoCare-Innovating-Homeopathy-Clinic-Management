package com.cdac.crudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.crudOperations.pojos.PatientHistory;
import com.cdac.crudOperations.service.IPatientHistoryService;

@RestController
@RequestMapping("/patientHistory")
@CrossOrigin("*")

public class PatientHistoryController {
	@Autowired
	private IPatientHistoryService PatientHistoryServiceImpl;
	@PostMapping("/addHistory")
	public PatientHistory addPatientHistory(@RequestBody PatientHistory Patienthistory )
	{
		return PatientHistoryServiceImpl.getHistory(Patienthistory);
	}
	@GetMapping("/getHistory")
	public List<PatientHistory> findusers(){
		
		return PatientHistoryServiceImpl.getHistory();
	}
}
