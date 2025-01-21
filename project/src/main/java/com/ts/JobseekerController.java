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

import com.dao.JobseekerDao;
import com.model.Employer;
import com.model.Jobseeker;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class JobseekerController {
	@Autowired
	JobseekerDao jobseekerDao;

	@GetMapping("getJobseekers")
	public List<Jobseeker> getJobseekers() {
		return jobseekerDao.getJobseekers();
	}
	
	@GetMapping("jobseekerLogin/{email}/{password}")
	public Jobseeker jobseekerLogin(@PathVariable String email, @PathVariable String password){
		return jobseekerDao.jobseekerLogin(email,password);
	}
	
	@GetMapping("getJobseekerById/{JobseekerId}")
	public Jobseeker getJobseekerById(@PathVariable int JobseekerId) {
		return jobseekerDao.getJobseekerById(JobseekerId);
	}
	
	@GetMapping("getJobseekerByName/{JobseekerName}")
	public Jobseeker getJobseekerByName(@PathVariable String JobseekerName) {
		return jobseekerDao.getJobseekerByName(JobseekerName);
	}
	
	@PostMapping("addJobseeker")
	public Jobseeker addJobseeker(@RequestBody Jobseeker Jobseeker) {
		return jobseekerDao.addJobseeker(Jobseeker);
	}
	
	@PutMapping("updateJobseeker")
	public Jobseeker updateJobseeker(@RequestBody Jobseeker Jobseeker) {
		return jobseekerDao.updateJobseeker(Jobseeker);
	}
	
	@DeleteMapping("deleteJobseekerById/{JobseekerId}")
	public String deleteJobseekerById(@PathVariable int JobseekerId) {
		jobseekerDao.deleteJobseekerById(JobseekerId);
		return "Jobseeker With JobseekerId:" + JobseekerId + " Deleted Successfully!!!" ;
	}
}
