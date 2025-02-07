package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.entity.City;
import com.luismibm.SimpleTable.model.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllCitiesService {

    @Autowired private CityRepository cityRepository;

    public Iterable<City> getAllCities() {
        return cityRepository.findAll();
    }

}