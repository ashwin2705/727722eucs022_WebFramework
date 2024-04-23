package com.example.day5cw2.AshwinService;

import org.springframework.stereotype.Service;

import com.example.day5cw2.AshwinModel.AshwinEmployee;
import com.example.day5cw2.Ashwinrepo.AshwinEmployeeRepo;

@Service
public class AshwinEmployeeService {
    public AshwinEmployeeRepo employeeRepo;
    public AshwinEmployeeService(AshwinEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(AshwinEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AshwinEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public AshwinEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
