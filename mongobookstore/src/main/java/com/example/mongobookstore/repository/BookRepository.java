package com.example.mongobookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongobookstore.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {
    
}