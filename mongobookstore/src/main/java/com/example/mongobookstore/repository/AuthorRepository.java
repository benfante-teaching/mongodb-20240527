package com.example.mongobookstore.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongobookstore.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {
    
}