package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserDao {

	@Autowired
	UserRepository userRepository;

	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public User getUserById(int UserId) {
		return userRepository.findById(UserId).orElse(null);
	}

	public User getUserByName(String UserName) {
		return userRepository.findByName(UserName);
	}

	public User addUser( User user) {
		return userRepository.save( user);
	}

	public User updateUser( User User) {
		return userRepository.save( User);
	}

	public void deleteUserById(int  UserId) {
		userRepository.deleteById( UserId);
	}
	
	public  User  userLogin(String email, String password){
		return userRepository. userLogin(email,password);
	}


	
}
