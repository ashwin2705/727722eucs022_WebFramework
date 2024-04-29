package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinStudentDetail;
import com.example.springapp.repository.AshwinStudentDetailRepository;
import com.example.springapp.repository.AshwinStudentRepository;

@Service
public class AshwinStudentDetailService {
    @Autowired
    AshwinStudentDetailRepository studentDetailRepository;
    @Autowired
    AshwinStudentRepository studentRepository;
    public AshwinStudentDetail addStudentDetail(int id,AshwinStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
