package com.example.mongobookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.mongobookstore.model.Author;
import com.example.mongobookstore.model.Book;
import com.example.mongobookstore.model.BookAndAuthor;
import com.example.mongobookstore.repository.AuthorRepository;
import com.example.mongobookstore.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    public BookAndAuthor addBookAndAuthor(BookAndAuthor bookAndAuthor) {
        Author author = authorRepository.save(bookAndAuthor.getAuthor());
        bookAndAuthor.getBook().getAuthorIds().add(author.getId());
        Book book = bookRepository.save(bookAndAuthor.getBook());
        return new BookAndAuthor(
            book,
            author);
    }
}
