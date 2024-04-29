package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinStudent;
import com.example.springapp.repository.AshwinStudentRepository;

@Service
public class AshwinStudentService {
    @Autowired
    AshwinStudentRepository studentRepository;
    public AshwinStudent addStudents(AshwinStudent student)
    {
        return studentRepository.save(student);
    }
    public List<AshwinStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<AshwinStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<AshwinStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
