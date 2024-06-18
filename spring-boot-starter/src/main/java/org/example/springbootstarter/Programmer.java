package org.example.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
    @Autowired
    Laptop laptop;
    public void code()
    {
        System.out.println("Programmer trying to code");
        System.out.println("First i need a laptop");
        laptop.compile();
    }
}
