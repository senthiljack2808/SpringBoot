package org.example.springmvccalculatorday7;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String displayHomePage() {
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(HttpServletRequest request, HttpSession session)  {

        int a= Integer.parseInt(request.getParameter("num1"));
        int b= Integer.parseInt(request.getParameter("num2"));
        session.setAttribute("result",a+b);
        System.out.println(a+b);
        return "result.jsp";
    }
}
