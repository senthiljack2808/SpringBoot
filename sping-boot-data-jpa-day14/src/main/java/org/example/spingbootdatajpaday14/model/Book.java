package org.example.spingbootdatajpaday14.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data 
public class Book {
    
    @Id
    int id;
    String bookname;
    String author;
    
}
