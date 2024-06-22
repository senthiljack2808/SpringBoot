package org.example.springbootday2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    
    Desktop()
    {
        System.out.println("Desktop obj created");
    }
    
    @Override
    public void compile() {
        System.out.println("compiling in Desktop...");
    }
}
