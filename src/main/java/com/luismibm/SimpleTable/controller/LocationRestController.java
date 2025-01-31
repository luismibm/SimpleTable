package com.luismibm.SimpleTable.controller;

import com.luismibm.SimpleTable.model.City;
import com.luismibm.SimpleTable.model.Country;
import com.luismibm.SimpleTable.model.Province;
import com.luismibm.SimpleTable.service.CityMinPopulationService;
import com.luismibm.SimpleTable.service.ProvinceGetByCountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/api/locations")
public class LocationRestController {

    @Autowired
    private ProvinceGetByCountryService provinceGetByCountryService;

    @Autowired
    private CityMinPopulationService cityMinPopulationService;

    @GetMapping("/provinces")
    public List<Province> getProvinceByCountry(String name) {
        return provinceGetByCountryService.getProvinceByCountry(name);
    }

    @GetMapping("/cities")
    public List<City> getCityMinPopulation(int minPopulation) {
        return cityMinPopulationService.getCityMinPopulation(minPopulation);
    }

    // http://localhost:8080/api/locations/provinces?name=Noruega
    // http://localhost:8080/api/locations/cities?minPopulation=1000

}