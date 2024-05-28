package com.example.demomongo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomongo.model.Movie;
import com.example.demomongo.repository.MovieRepository;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private static final Logger log = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MongoTemplate mongoTemplate;
    
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public Iterable<Movie> getAllMoviesWithRepository(@RequestParam("director") String director) {
        return movieRepository.findByDirectors(director);
    }

    // @GetMapping
    public Iterable<Movie> getAllMovies(@RequestParam("director") String director) {
        Query query = new Query();
        query.addCriteria(Criteria.where("directors").in(director));
        log.info(query.toString());
        return mongoTemplate.find(query, Movie.class);
    }
}