package com.cdac.crudOperations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.crudOperations.pojos.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
