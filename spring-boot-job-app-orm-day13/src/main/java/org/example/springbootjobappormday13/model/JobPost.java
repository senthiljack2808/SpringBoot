package org.example.springbootjobappormday13.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@Entity
public class JobPost {
    
    @Id
    int postId;
    String jobDescription;
    int yearOfExperience;
}
