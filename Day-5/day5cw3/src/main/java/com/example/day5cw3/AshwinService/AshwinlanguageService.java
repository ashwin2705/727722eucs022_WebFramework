package com.example.day5cw3.AshwinService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.AshwinModel.AshwinLanguage;
import com.example.day5cw3.AshwinRepo.Ashwinlanguagerepo;

@Service
public class AshwinlanguageService {
    private Ashwinlanguagerepo languageRepo;
    public AshwinlanguageService(Ashwinlanguagerepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(AshwinLanguage language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AshwinLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AshwinLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AshwinLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
