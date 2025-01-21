package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("from User where userName = :userName")
	User findByName(@Param("userName") String userName);
	
	@Query("from User where email = :email and password = :password")
	User userLogin(@Param("email") String email, @Param("password") String password);
}