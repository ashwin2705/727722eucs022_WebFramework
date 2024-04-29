package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.AshwinAddress;
import com.example.ce1.repository.AshwinAddressRepo;
import com.example.ce1.repository.AshwinEmployeeRepo;

@Service
public class AshwinAddressService {
    @Autowired
    AshwinAddressRepo addressRepo;
    @Autowired
    AshwinEmployeeRepo employeeRepo;
    public AshwinAddress setAddressById(int id,AshwinAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
