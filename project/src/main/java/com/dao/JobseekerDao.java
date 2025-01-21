package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employer;
import com.model.Jobseeker;

@Service
public class JobseekerDao {
	
	@Autowired
	JobseekerRepository jobseekerRepository;

	public List<Jobseeker> getJobseekers() {
		return jobseekerRepository.findAll();
	}

	public Jobseeker getJobseekerById(int JobseekerId) {
		return jobseekerRepository.findById(JobseekerId).orElse(null);
	}

	public Jobseeker getJobseekerByName(String JobseekerName) {
		return jobseekerRepository.findByName(JobseekerName);
	}

	public Jobseeker addJobseeker(Jobseeker Jobseeker) {
		return jobseekerRepository.save(Jobseeker);
	}

	public Jobseeker updateJobseeker(Jobseeker Jobseeker) {
		return jobseekerRepository.save(Jobseeker);
	}

	public void deleteJobseekerById(int JobseekerId) {
		jobseekerRepository.deleteById(JobseekerId);
	}
	
	public Jobseeker jobseekerLogin(String email, String password){
		return jobseekerRepository.jobseekerLogin(email,password);
	}
	
}
