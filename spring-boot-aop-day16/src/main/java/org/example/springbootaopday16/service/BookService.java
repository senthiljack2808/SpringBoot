package org.example.springbootaopday16.service;

import java.util.List;
import org.example.springbootaopday16.model.Book;
import org.example.springbootaopday16.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepo repo;
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public void addBook(Book book) {
        repo.save(book);
    }
}
