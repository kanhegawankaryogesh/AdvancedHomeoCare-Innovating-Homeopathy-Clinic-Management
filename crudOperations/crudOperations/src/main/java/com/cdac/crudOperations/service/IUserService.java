package com.cdac.crudOperations.service;

import java.util.List;
import java.util.Optional;

import com.cdac.crudOperations.pojos.User;

public interface IUserService {
User addUser(User user);

List<User> getUsers();

User getUserbyid(int id);

User updateUser(User existinguser,User updatedUser);

String deletuser(int id);


}