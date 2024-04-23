package com.example.day5cw2.Ashwinrepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.AshwinModel.AshwinEmployee;


@Repository
public interface AshwinEmployeeRepo extends JpaRepository<AshwinEmployee,Integer>{
    
}
