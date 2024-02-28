package com.cdac.crudOperations.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.crudOperations.pojos.Login;


public interface LoginRepository extends JpaRepository<Login,Integer> {
	
    public List<Login> findByuserRole(String role);
//   
	public Login findByemail(String email);
	public Login findByphNo(String phNo);
}

