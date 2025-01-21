package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;

import com.model.User;


@CrossOrigin(origins="http://localhost:3000")
@RestController
public class UserController {
	
	@Autowired
	UserDao userDao;

	@GetMapping("getUsers")
	public List<User> getUsers() {
		return userDao.getUsers();
	}
	
	@GetMapping("userLogin/{email}/{password}")
	public User UserLogin(@PathVariable String email, @PathVariable String password){
		return userDao.userLogin(email,password);
	}
	
	@GetMapping("getUserById/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userDao.getUserById(userId);
	}
	
	@GetMapping("getUserByName/{UserName}")
	public User getUserByName(@PathVariable String UserName) {
		
		return userDao.getUserByName(UserName);
	}
	
	@PostMapping("addUser")
	public User addUser(@RequestBody User User) {
		return userDao.addUser(User);
	}
	
	@PutMapping("updateUser")
	public User updateUser(@RequestBody User User) {
		return userDao.updateUser(User);
	}
	
	@DeleteMapping("deleteUserById/{UserId}")
	public String deleteUserById(@PathVariable int UserId) {
		userDao.deleteUserById(UserId);
		return "User With UserId:" + UserId + " Deleted Successfully!!!" ;
	}
}
