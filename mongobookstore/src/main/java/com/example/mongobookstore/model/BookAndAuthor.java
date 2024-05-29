package com.example.mongobookstore.model;

public class BookAndAuthor {
    private Book book;
    private Author author;
    
    public BookAndAuthor() {}

    public BookAndAuthor(Book book, Author author) {
        this.book = book;
        this.author = author;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
   
}