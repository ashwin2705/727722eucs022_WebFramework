package com.example.day14ce1.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.model.AshwinPayroll;
import com.example.day14ce1.service.AshwinPayrollService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class AshwinPayrollController {
    @Autowired
    AshwinPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public AshwinPayroll addPayroll(@PathVariable Long employeeId,@RequestBody AshwinPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<AshwinPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}
