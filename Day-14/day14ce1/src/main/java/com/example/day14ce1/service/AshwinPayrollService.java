package com.example.day14ce1.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.model.AshwinPayroll;
import com.example.day14ce1.repository.AshwinPayrollRepo;

@Service
public class AshwinPayrollService {
    @Autowired
    AshwinPayrollRepo payrollRepo;

    public AshwinPayroll addPayroll(Long id,AshwinPayroll payroll)
    {
        AshwinPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<AshwinPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}
