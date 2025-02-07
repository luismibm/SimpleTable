package com.luismibm.SimpleTable.model.repository;

import com.luismibm.SimpleTable.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> { }