package com.example.day14ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.model.AshwinEmployee;

@Repository
public interface AshwinEmployeeRepo extends JpaRepository<AshwinEmployee,Long> {
    
}
