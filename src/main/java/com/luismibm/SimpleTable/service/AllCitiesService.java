package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.City;
import com.luismibm.SimpleTable.model.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllCitiesService {

    @Autowired private CityRepository cityRepository;

    public Iterable<City> getAllCities() {
        return cityRepository.findAll();
    }

}