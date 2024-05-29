package com.example.mongobookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.mongobookstore.BookService;
import com.example.mongobookstore.model.BookAndAuthor;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public BookAndAuthor addBookAndAuthor(@RequestBody BookAndAuthor bookAndAuthor) {
        return bookService.addBookAndAuthor(bookAndAuthor);
    }
}