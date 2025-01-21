package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer>{

	@Query("from Employer where empName = :employerName")
	Employer findByName(@Param("employerName") String employerName);
	
	@Query("from Employer where email = :email and password = :password")
	Employer employerLogin(@Param("email") String email, @Param("password") String password);
}