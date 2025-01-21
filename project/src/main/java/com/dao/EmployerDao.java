package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employer;

@Service
public class EmployerDao {

	@Autowired
	EmployerRepository employerRepository;

	public List<Employer> getEmployers() {
		return employerRepository.findAll();
	}

	public Employer getEmployerById(int EmployerId) {
		return employerRepository.findById(EmployerId).orElse(null);
	}

	public Employer getEmployerByName(String EmployerName) {
		return employerRepository.findByName(EmployerName);
	}

	public Employer addEmployer(Employer Employer) {
		return employerRepository.save(Employer);
	}

	public Employer updateEmployer(Employer Employer) {
		return employerRepository.save(Employer);
	}

	public void deleteEmployerById(int EmployerId) {
		employerRepository.deleteById(EmployerId);
	}
	
	public Employer employerLogin(String email, String password){
		return employerRepository.employerLogin(email,password);
	}


	
}
