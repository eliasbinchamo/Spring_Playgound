package com.example.demo.repository;

import com.example.demo.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
//    @Query("{'name': ?0}")
//    List<Book> findAllByName(String name);
}
