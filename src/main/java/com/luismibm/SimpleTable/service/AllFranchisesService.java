package com.luismibm.SimpleTable.service;

import com.luismibm.SimpleTable.model.entity.Franchise;
import com.luismibm.SimpleTable.model.repository.FranchiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllFranchisesService {

    @Autowired private FranchiseRepository franchiseRepository;

    public Iterable<Franchise> getAllFranchises() {
        return franchiseRepository.findAll();
    }

}