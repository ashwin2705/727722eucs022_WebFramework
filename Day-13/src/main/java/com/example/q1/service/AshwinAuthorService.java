package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.AshwinAuthor;
import com.example.q1.repository.AshwinAuthorRepository;

@Service
public class AshwinAuthorService {
    @Autowired
    private AshwinAuthorRepository authorRepository;

    public AshwinAuthor saveAuthor(AshwinAuthor author) {
        return authorRepository.save(author);
    }

    public AshwinAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<AshwinAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public AshwinAuthor updateAuthor(Long id, AshwinAuthor author) {
        AshwinAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
