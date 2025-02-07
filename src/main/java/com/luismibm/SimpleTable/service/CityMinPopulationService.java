package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.entity.City;
import com.luismibm.SimpleTable.model.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityMinPopulationService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> getCityMinPopulation(int minPopulation) {
        List<City> allCities = cityRepository.findAll();
        List<City> filteredCities = new ArrayList<>();

        for (City c : allCities) {
            if (c.getPopulation() > minPopulation) {
                filteredCities.add(c);
            }
        }
        return filteredCities;
    }

}