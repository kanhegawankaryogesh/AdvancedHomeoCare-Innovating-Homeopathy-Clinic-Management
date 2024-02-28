package com.cdac.crudOperations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.crudOperations.pojos.PatientHistory;

public interface PatientHistoryRepository extends JpaRepository<PatientHistory,Integer> {

}
