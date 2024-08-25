package org.example.springbootaopday16.controller;

import java.util.List;
import org.example.springbootaopday16.model.Book;
import org.example.springbootaopday16.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @Autowired
    BookService service;
    
    @GetMapping("/books")
    public List<Book> viewAllBooks()  {
        return service.getAllBooks();
    }
    
    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
    }
}
