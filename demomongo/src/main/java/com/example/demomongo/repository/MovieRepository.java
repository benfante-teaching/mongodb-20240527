package com.example.demomongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demomongo.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String>{
    List<Movie> findByDirectors(String director);
}