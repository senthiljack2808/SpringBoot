package org.example.springbootjobapprestcontrollerday11.service;

import java.util.List;
import org.example.springbootjobapprestcontrollerday11.model.JobPost;
import org.example.springbootjobapprestcontrollerday11.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    
    @Autowired
    JobRepo jobRepo;
    
    public List<JobPost> getAllJobPosts() {
        return jobRepo.getAllJobPostsFromDb();
    }

    public void addJobPost(JobPost jobPost) {
        jobRepo.addJobPostToDb(jobPost);
    }

    public void removeJobPost(int jobId) {
        jobRepo.removeJobPostFromDb(jobId);
    }

    public void updateJobPost(JobPost jobPost,int jobId) {
        jobRepo.updateJobPostToDb(jobPost,jobId);
    }
}
