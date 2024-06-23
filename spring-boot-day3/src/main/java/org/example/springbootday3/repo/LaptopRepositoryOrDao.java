package org.example.springbootday3.repo;

import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepositoryOrDao {
    
    public void save()
    {
        System.out.println("Saved data to database........");
    }
}
