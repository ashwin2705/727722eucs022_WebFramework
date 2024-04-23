package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinModel;
import com.example.springapp.repository.AshwinPersonRepo;

@Service
public class AshwinPersonService {
    @Autowired
    private AshwinPersonRepo rep;

    public boolean post(AshwinModel person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<AshwinModel> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AshwinModel> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
