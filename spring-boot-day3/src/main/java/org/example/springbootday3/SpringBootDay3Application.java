package org.example.springbootday3;

import org.example.springbootday3.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDay3Application {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringBootDay3Application.class, args);
        LaptopService laptopService=context.getBean(LaptopService.class);
        laptopService.filterGoodLaptop();
    }

}
