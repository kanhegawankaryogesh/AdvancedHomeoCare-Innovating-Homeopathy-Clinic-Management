package com.cdac.crudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cdac.crudOperations.dao.LoginRepository;
import com.cdac.crudOperations.pojos.Login;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepo;

	public List<Login> getUsersByRole(String role) {

		return loginRepo.findByuserRole(role);
	}
	public ResponseEntity<String> registerUser(Login newUser) {
		if (loginRepo.findByemail(newUser.getEmail()) != null || loginRepo.findByphNo(newUser.getPhNo())!= null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("User already exists with this email: " + newUser.getEmail());
		} else {
			loginRepo.save(newUser);
			return ResponseEntity.status(HttpStatus.OK).body("User registered successfully");
		}

	}

	public ResponseEntity<String> loginUser(Login loginUser) {
	    List<Login> logins = loginRepo.findAll();
	    System.out.println(loginUser.getEmail());
	    for (Login login : logins) {
	        if ((login.getEmail() != null && login.getEmail().equals(loginUser.getEmail())) || 
	            (login.getPhNo() != null && login.getPhNo().equals(loginUser.getPhNo()))) {
	            if (login.getPassword().equals(loginUser.getPassword())) {
	                return ResponseEntity.status(HttpStatus.OK).body(login.getUserRole());
	            } else {
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid password");
	            }
	        }
	    }
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User not found");
	}

	
}
