package org.example.springbootrestday15.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Entity
@Component
public class Book {
    @Id
   int id;
   String bookname;
   String author;
}
