package org.example.spingbootdatajpaday14.service;

import java.util.List;
import org.example.spingbootdatajpaday14.model.Book;
import org.example.spingbootdatajpaday14.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired    
    BookRepo repo;
    public void addBook(Book book) {
      repo.save(book);        
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public void deleteBook(Integer bookId) {
        repo.deleteById(bookId);
    }

    public void updateBook(Book book) {
        repo.save(book);
    }
}
