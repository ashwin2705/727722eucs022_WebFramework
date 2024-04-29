package com.example.day14ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.model.AshwinBook;

@Repository
public interface AshwinBookRepo extends JpaRepository<AshwinBook,Integer> {
    
}
