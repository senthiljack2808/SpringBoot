package org.example.springbootjobappday10.service;

import java.util.List;
import org.example.springbootjobappday10.model.JobPost;
import org.example.springbootjobappday10.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    
    @Autowired
    private JobRepo jobRepo;
    
    public void addJob(JobPost jobPost) {
        jobRepo.addJob(jobPost);
    }

    public List<JobPost> viewAllJobs()
    {
      return jobRepo.viewAllJobs();
    }
}
