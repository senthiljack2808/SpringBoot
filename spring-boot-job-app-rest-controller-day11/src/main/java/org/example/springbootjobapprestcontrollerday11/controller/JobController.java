package org.example.springbootjobapprestcontrollerday11.controller;

import java.util.List;
import org.example.springbootjobapprestcontrollerday11.model.JobPost;
import org.example.springbootjobapprestcontrollerday11.service.JobService;
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
    public String displayHomePage()
    {
        return "I am home Page";
    }
    @GetMapping("/jobPosts")
    public List<JobPost> viewAllJobPosts()
    {
        return jobService.getAllJobPosts(); 
    }
    
    @PostMapping("/jobPost")
    public void addJobPost(@RequestBody JobPost jobPost)
    {
        jobService.addJobPost(jobPost);
    }   
    
    @PutMapping("/jobPost/{jobId}")
    public void updateJobPost(@RequestBody JobPost jobPost,@PathVariable int jobId)
    {
        jobService.updateJobPost(jobPost,jobId);
    }
    
    @DeleteMapping("/jobPost/{jobId}") 
    public void removeJobPost(@PathVariable int jobId)
    {
        jobService.removeJobPost(jobId); 
    }
    
    
}
