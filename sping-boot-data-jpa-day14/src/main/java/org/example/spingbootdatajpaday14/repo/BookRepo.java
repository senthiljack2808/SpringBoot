package org.example.spingbootdatajpaday14.repo;

import java.util.List;
import org.example.spingbootdatajpaday14.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
    List<Book> findByAuthorContaining(String keyword);
}
