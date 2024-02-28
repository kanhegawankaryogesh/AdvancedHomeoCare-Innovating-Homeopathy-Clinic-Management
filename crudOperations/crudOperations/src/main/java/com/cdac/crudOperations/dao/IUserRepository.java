package com.cdac.crudOperations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.crudOperations.pojos.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
