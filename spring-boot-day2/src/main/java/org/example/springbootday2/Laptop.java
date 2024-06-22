package org.example.springbootday2;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    Laptop()
    {
        System.out.println("Laptop obj created");
    }

    @Override
    public void compile() {
        System.out.println("compiling in Laptop...");
    }
}
