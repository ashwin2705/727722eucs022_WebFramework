package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.AshwinStudent;
import com.examly.springapp.repository.AshwinStudentRepo;

@Service
public class AshwinStudentService {
    @Autowired
    private AshwinStudentRepo studentRepo;

    public boolean post(AshwinStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AshwinStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<AshwinStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
