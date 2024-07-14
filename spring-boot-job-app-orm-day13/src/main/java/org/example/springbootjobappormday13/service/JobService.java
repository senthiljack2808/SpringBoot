package org.example.springbootjobappormday13.service;

import java.util.List;
import org.example.springbootjobappormday13.model.JobPost;
import org.example.springbootjobappormday13.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;
    public void addJobPost(JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public List<JobPost> getAllJobPost() {
        return jobRepo.findAll();
    }

    public void updateJobPost(int jobPostId, JobPost jobPost) {
        jobRepo.save(jobPost);
    }

    public void deleteJobPost(int jobPostId) {
        jobRepo.deleteById(jobPostId);
    }
}
