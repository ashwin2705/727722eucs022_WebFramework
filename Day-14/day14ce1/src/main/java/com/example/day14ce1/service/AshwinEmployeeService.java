package com.example.day14ce1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.AshwinEmployee;
import com.example.day14ce1.repository.AshwinEmployeeRepo;

@Service

public class AshwinEmployeeService {
    @Autowired
    AshwinEmployeeRepo employeeRepo;

    public AshwinEmployee addEmployee(AshwinEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AshwinEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<AshwinEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}
