package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Employer;
import com.model.Jobseeker;


@Repository
public interface JobseekerRepository extends JpaRepository<Jobseeker, Integer>{

	@Query("from Jobseeker where uname = :username")
	Jobseeker findByName(@Param("username") String username);
	
	@Query("from Jobseeker where email = :email and password = :password")
	Jobseeker jobseekerLogin(@Param("email") String email, @Param("password") String password);

}

