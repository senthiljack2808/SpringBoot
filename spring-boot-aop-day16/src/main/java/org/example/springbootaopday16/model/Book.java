package org.example.springbootaopday16.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Entity
@Data
public class Book {
    @Id
    int id;
    String bookname;
    String author;
}
