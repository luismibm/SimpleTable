package com.luismibm.SimpleTable.model.repository;

import com.luismibm.SimpleTable.model.entity.Franchise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FranchiseRepository extends JpaRepository<Franchise, Long> { }