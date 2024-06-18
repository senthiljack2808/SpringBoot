package org.example.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
     Cpu cpu;
    public void compile() {
        cpu.run();
        System.out.println("I have successfully compiled my code");
    }
}
