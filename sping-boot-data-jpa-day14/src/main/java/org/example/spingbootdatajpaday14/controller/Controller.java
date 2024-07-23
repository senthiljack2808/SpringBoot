package org.example.spingbootdatajpaday14.controller;

import java.util.List;
import org.example.spingbootdatajpaday14.model.Book;
import org.example.spingbootdatajpaday14.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    BookService service;
    
    @GetMapping("/")
    public String displayHomePage() {
        return "Welcome to Book store!";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }
    
    @GetMapping("/books/{keyword}")
    public List<Book> getBooksByKeyword(@PathVariable String keyword)
    {
        return service.getBooksByKeyword(keyword);
    }    
    @PostMapping("/book")
    public void addBookToDb(@RequestBody Book book) 
    {
       service.addBook(book);
    }
    
    @DeleteMapping("/book/{bookId}")
    public void deleteBook(@PathVariable Integer bookId)
    {
        service.deleteBook(bookId);
    }
    
    
    @PutMapping("/book")
    public void updateBook(@RequestBody Book book)
    {
        service.updateBook(book);
    }
    
    
    
    
    
}
