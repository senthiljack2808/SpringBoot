package org.example.springmvcday6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String getHomePage()
    {
        System.out.println("Home page");
        return "index.jsp";
    }
}
