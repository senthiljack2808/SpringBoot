package org.example.springbootday2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Programmer {


    @Value("25")
    private int age;
    
    @Value("Senthil")
    private String name;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    private Computer computer;
    
     public void code()
     {
         System.out.println(String.format("Programmer %s of age %s is trying to compile",name,age));
         computer.compile();
     }
}
