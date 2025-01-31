package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.Country;
import com.luismibm.SimpleTable.model.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllCountriesService {

    @Autowired private CountryRepository countryRepository;

    public Iterable<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}