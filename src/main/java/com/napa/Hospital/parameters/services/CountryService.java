package com.napa.Hospital.parameters.services;

import com.napa.Hospital.parameters.models.Country;
import com.napa.Hospital.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAll(){
        return countryRepository.findAll();}

}
