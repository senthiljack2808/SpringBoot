package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo/controller")

public class DemoController {

    @GetMapping("books")
    @ResponseBody
    public String getTitle() {
        return "Demo controller hello world";
    }

}
