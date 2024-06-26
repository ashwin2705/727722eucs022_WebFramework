package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AshwinPerson;
import java.util.List;


@Repository
public interface AshwinPersonRepo extends JpaRepository<AshwinPerson,Integer>{

    List<AshwinPerson> findByLastnameNot(String lastname);
    List<AshwinPerson> findByAgeNotIn(List<Integer> ages);
    
}
