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

import com.dao.EmployerDao;
import com.model.Employer;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EmployerController {
	
	@Autowired
	EmployerDao employerDao;

	@GetMapping("getEmployers")
	public List<Employer> getEmployers() {
		return employerDao.getEmployers();
	}
	
	@GetMapping("empLogin/{email}/{password}")
	public Employer employerLogin(@PathVariable String email, @PathVariable String password){
		return employerDao.employerLogin(email,password);
	}
	
	@GetMapping("getEmployerById/{employerId}")
	public Employer getEmployerById(@PathVariable int employerId) {
		return employerDao.getEmployerById(employerId);
	}
	
	@GetMapping("getEmployerByName/{EmployerName}")
	public Employer getEmployerByName(@PathVariable String EmployerName) {
		return employerDao.getEmployerByName(EmployerName);
	}
	
	@PostMapping("addEmployer")
	public Employer addEmployer(@RequestBody Employer Employer) {
		return employerDao.addEmployer(Employer);
	}
	
	@PutMapping("updateEmployer")
	public Employer updateEmployer(@RequestBody Employer Employer) {
		return employerDao.updateEmployer(Employer);
	}
	
	@DeleteMapping("deleteEmployerById/{EmployerId}")
	public String deleteEmployerById(@PathVariable int EmployerId) {
		employerDao.deleteEmployerById(EmployerId);
		return "Employer With EmployerId:" + EmployerId + " Deleted Successfully!!!" ;
	}
}
