package org.example.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterApplication {

    public static void main(String[] args) {

        ApplicationContext contextOrIocContainer=SpringApplication.run(SpringBootStarterApplication.class, args);
        Programmer programmer=contextOrIocContainer.getBean(Programmer.class);
        programmer.code();
        
    }

}
