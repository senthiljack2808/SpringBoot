package org.example.springbootjobappormday13.controller;

import java.util.List;
import org.example.springbootjobappormday13.model.JobPost;
import org.example.springbootjobappormday13.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    
    @Autowired
    JobService jobService;
    
    @GetMapping("/")
    public String displayHomePage() {
        return "I am home page"; 
    }

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobPost()
    {
        return jobService.getAllJobPost();
    }
    
    
    @PostMapping("/jobPost")
    public String addJobPost(@RequestBody JobPost jobPost)
    {
        jobService.addJobPost(jobPost);
        return "Success";
    }
    
    @PutMapping("/jobPost/{jobPostId}")
    public void updateJobPost(@PathVariable int jobPostId, @RequestBody JobPost jobPost)
    {
        jobService.updateJobPost(jobPostId,jobPost);
    }
    
    @DeleteMapping("/jobPost/{jobPostId}")
    public void deleteJobPost(@PathVariable int jobPostId)
    {
        jobService.deleteJobPost(jobPostId);
    }
    
    
    
}
