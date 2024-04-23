package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.AshwinStudent;
import java.util.List;

@Repository
public interface AshwinStudentRepo extends JpaRepository<AshwinStudent, Long> {

    List<AshwinStudent> findByMarksGreaterThan(int mark);

    List<AshwinStudent> findByMarksLessThan(int mark);

}
