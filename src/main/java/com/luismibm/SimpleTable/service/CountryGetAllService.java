package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.Country;
import com.luismibm.SimpleTable.model.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryGetAllService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Create: getCountryById

}