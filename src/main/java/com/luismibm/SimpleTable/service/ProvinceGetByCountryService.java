package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.Province;
import com.luismibm.SimpleTable.model.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProvinceGetByCountryService {

    @Autowired
    private ProvinceRepository provinceRepository;

    public List<Province> getProvinceByCountry(String countryName) {
        List<Province> provinces = provinceRepository.findAll();
        List<Province> result = new ArrayList<>();
        for (Province p : provinces) {
            if (p.getCountry().getName().equalsIgnoreCase(countryName)) {
                result.add(p);
            }
        }
        return result;
    }

}