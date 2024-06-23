package org.example.springbootday3.service;

import org.example.springbootday3.repo.LaptopRepositoryOrDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    
    private final LaptopRepositoryOrDao laptopRepository;

    @Autowired
    public LaptopService(LaptopRepositoryOrDao laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    public void filterGoodLaptop()
    {
        System.out.println("Filtering good laptop and saving them to database");
        laptopRepository.save();
    }
}
