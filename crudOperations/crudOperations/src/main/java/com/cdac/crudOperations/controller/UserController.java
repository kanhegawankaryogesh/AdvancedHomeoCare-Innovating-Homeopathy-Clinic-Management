package com.cdac.crudOperations.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.crudOperations.pojos.User;
import com.cdac.crudOperations.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@PostMapping("/add")
	public User registorUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/getuser")
	public List<User> findusers(){
		
		return userService.getUsers();
	}
	
	@GetMapping("/getbyid/{id}")
    public User findusersone( @PathVariable Integer id){
		
		return userService.getUserbyid(id);
	}
	
	@PutMapping("/updatevalue/{uid}")
	public User updateduser(@PathVariable int uid ,@RequestBody User Updateduser) {
		
		User existingUser= userService.getUserbyid(uid);
		
		return userService.updateUser(existingUser, Updateduser);
	}
	
	@DeleteMapping("/delete/{id}")
    public String deluserbyid(@PathVariable int id) {
		return userService.deletuser(id);
		 
	}
}
