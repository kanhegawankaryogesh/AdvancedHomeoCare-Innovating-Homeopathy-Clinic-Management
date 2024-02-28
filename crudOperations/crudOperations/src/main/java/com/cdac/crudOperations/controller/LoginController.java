package com.cdac.crudOperations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.crudOperations.pojos.Login;
import com.cdac.crudOperations.service.LoginService;

@RestController
@CrossOrigin("*") // connect with any platform
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/getUsers/{role}")
	public List<Login> getUsersByRole(@PathVariable String role) {
		return loginService.getUsersByRole(role);
	}

	@PostMapping("/regUser")
	public ResponseEntity<String> registerUser(@RequestBody Login newUser) {
		System.out.println(newUser.getPassword());
		System.out.println(newUser.getEmail());
		return loginService.registerUser(newUser);
	}

	@PostMapping("/loginUser")
	public ResponseEntity<String> loginUser(@RequestBody Login logUser) {
		System.out.println(logUser);
		return loginService.loginUser(logUser);
	}
}
