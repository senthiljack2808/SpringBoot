package org.example.springbootday9modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @ModelAttribute("course")
    public String getCourse()
    {
        return "Java";
    }
    
    @RequestMapping("/")
    public String  displayHomePage()
    {
        return "index";
    }
    
    @RequestMapping("/add")
    public String add(Student student)
    {
        return "result";
    }
}
