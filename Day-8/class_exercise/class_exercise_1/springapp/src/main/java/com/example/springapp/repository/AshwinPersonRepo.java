package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AshwinModel;
import java.util.List;


@Repository
public interface AshwinPersonRepo extends JpaRepository<AshwinModel,Integer>{

    List<AshwinModel> findByNameStartingWith(String name);
    List<AshwinModel> findByNameEndingWith(String name);
    
}
