package com.example.day14ce2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce2.model.AshwinBook;
import com.example.day14ce2.repository.AshwinBookRepo;

@Service
public class AshwinBookService {
   @Autowired
   AshwinBookRepo bookRepo;

   public AshwinBook addBook(AshwinBook book)
   {
        return bookRepo.save(book);
   }

   public List<AshwinBook> getBooks()
   {
        return bookRepo.findAll();
   }

   public Optional<AshwinBook> getBook(int id)
   {
    return bookRepo.findById(id);
   }

   public AshwinBook updateBook(int id,AshwinBook book)
   {
     AshwinBook avail = bookRepo.findById(id).orElse(null);
        if(avail!=null)
        {
            avail.setAuthor(book.getAuthor());
            avail.setAvailableCopies(book.getAvailableCopies());
            avail.setTitle(book.getTitle());
            avail.setTotalCopies(book.getTotalCopies());
            return bookRepo.save(avail);
        }
        else 
        return null;
   }
}
