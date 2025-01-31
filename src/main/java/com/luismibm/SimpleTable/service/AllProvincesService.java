package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.Province;
import com.luismibm.SimpleTable.model.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllProvincesService {

    @Autowired private ProvinceRepository provinceRepository;

    public Iterable<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }

}