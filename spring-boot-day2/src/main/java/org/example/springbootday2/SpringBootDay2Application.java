package org.example.springbootday2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDay2Application {

    public static void main(String[] args) {
        
        ApplicationContext context=SpringApplication.run(SpringBootDay2Application.class, args);
        Programmer programmer=context.getBean(Programmer.class);
        programmer.code();
        
    }

}
