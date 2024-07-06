package org.example.springbootjobappday10;

import java.util.List;
import org.example.springbootjobappday10.model.JobPost;
import org.example.springbootjobappday10.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    
    @Autowired
    JobService service;
    
    @GetMapping({"/","home"})
    public String displayHomePage() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addJobPost()
    {
        return "addjob";
    }

    @PostMapping("/handleForm")
    public String handleJobPost(JobPost jobPost)
    {
        System.out.println("hello handle form!");
        service.addJob(jobPost);
        return "success";  
    }
    
    @GetMapping("/viewalljobs")
    public String viewAllJobPost(Model model)
    {
        System.out.println("view all jobs "+service.viewAllJobs());
        List<JobPost> jobPosts = service.viewAllJobs();
        model.addAttribute("jobPosts", jobPosts);
        return "viewalljobs";
    }
    
}
