package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.entity.Province;
import com.luismibm.SimpleTable.model.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllProvincesService {

    @Autowired private ProvinceRepository provinceRepository;

    public Iterable<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }

}