package org.example.spingbootdatajpaday14.repo;

import org.example.spingbootdatajpaday14.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}
