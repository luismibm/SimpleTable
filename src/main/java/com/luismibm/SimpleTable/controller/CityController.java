package com.luismibm.SimpleTable.controller;

import com.luismibm.SimpleTable.model.City;
import com.luismibm.SimpleTable.model.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping
    public List<City> getCities() {
        return (List<City>) cityRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(value = "id") Long id) {
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent()) {
            return ResponseEntity.ok().body(city.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public City createCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @PutMapping("/{id}")
    public ResponseEntity<City> updateCity(@PathVariable Long id, @RequestBody City updatedCity) {
        Optional<City> optionalCity = cityRepository.findById(id);
        if (optionalCity.isPresent()) {
            City city = optionalCity.get();
            city.setName(updatedCity.getName());
            return ResponseEntity.ok().body(cityRepository.save(city));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityRepository.deleteById(id);
    }

}
