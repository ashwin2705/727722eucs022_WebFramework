package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AshwinEmployee;
import com.example.ce1.repository.AshwinEmployeeRepo;

@Service
public class AshwinEmployeeService {
    @Autowired
    AshwinEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public AshwinEmployee setEmployee(AshwinEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<AshwinEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<AshwinEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
