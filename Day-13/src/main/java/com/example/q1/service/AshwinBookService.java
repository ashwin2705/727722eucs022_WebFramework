package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.AshwinAuthor;
import com.example.q1.model.AshwinBook;
import com.example.q1.repository.AshwinAuthorRepository;
import com.example.q1.repository.AshwinBookRepository;
import com.example.q1.repository.AshwinBookRepository;

@Service
public class AshwinBookService {
    @Autowired
    private AshwinBookRepository bookRepository;
@Autowired
private AshwinAuthorRepository authorRepository;
    public AshwinBook saveBook(Long authorId, AshwinBook book) {
        AshwinAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public AshwinBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

