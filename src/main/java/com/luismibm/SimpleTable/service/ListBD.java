package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.entity.City;
import com.luismibm.SimpleTable.model.entity.Country;
import com.luismibm.SimpleTable.model.entity.Province;
import com.luismibm.SimpleTable.model.repository.CityRepository;
import com.luismibm.SimpleTable.model.repository.CountryRepository;
import com.luismibm.SimpleTable.model.repository.ProvinceRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListBD {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    ProvinceRepository provinceRepository;

    @Autowired
    CityRepository cityRepository;

    private void listCountries() {
        List<Country> countries = countryRepository.findAll();
        System.out.println("- Countries:");
        for (Country c : countries) {
            System.out.println(c.getName());
        }
    }

    private void listProvinces() {
        List<Province> provinces = provinceRepository.findAll();
        System.out.println("- Provinces:");
        for (Province p : provinces) {
            System.out.println(p.getName());
        }
    }

    private void listCities() {
        List<City> cities = cityRepository.findAll();
        System.out.println("- Cities:");
        for (City c : cities) {
            System.out.println(c.getName());
        }
    }

    @PostConstruct // Se ejecuta automáticamente al iniciar el programa
    public void listOnTerminal() {
        System.out.println("- - COMPLETE LIST - -");
        listCountries();
        listProvinces();
        listCities();
    }

}