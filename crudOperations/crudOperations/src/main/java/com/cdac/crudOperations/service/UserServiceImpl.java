package com.cdac.crudOperations.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.crud.customException.userHandlingException;
import com.cdac.crudOperations.dao.IUserRepository;
import com.cdac.crudOperations.pojos.User;

import jakarta.transaction.Transactional;
@Service
@Transactional

public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository userRepo;
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public User getUserbyid(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow(()->new userHandlingException("invlid id"));
	}
	@Override
	public User updateUser(User existinguser, User updatedUser) {
		// TODO Auto-generated method stub
//		existinguser.setUserName(updatedUser.getUserName());
		existinguser.setAge(updatedUser.getAge());
	//	existinguser.setFirstName(updatedUser.getFirstName());
		return userRepo.save(existinguser);
	}
	@Override
	public String deletuser(int id) {
		// TODO Auto-generated method stub
		  userRepo.deleteById(id);
		  
		  return "delete";
	}

	
	
	


	
	
	
	


}
