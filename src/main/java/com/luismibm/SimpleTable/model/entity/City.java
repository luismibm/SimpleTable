package com.luismibm.SimpleTable.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity @Table(name = "CITY")
public class City {

    @Id
    private long id;
    private String name;
    private int population;

    @ManyToOne @JoinColumn(name = "province_id")
    private Province province;

    // https://www.baeldung.com/jpa-many-to-many
    @ManyToMany
    @JoinTable (
            name = "CITY-FRANCHISE",
            joinColumns = @JoinColumn(name = "ID_FRANCHISE"),
            inverseJoinColumns = @JoinColumn(name = "ID_CITY")
    )
    Set<Franchise> franchises;

    public City() { }

    public City(long id, String name, int population, Province province) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.province = province;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public Set<Franchise> getFranchises() {
        return franchises;
    }

    public void setFranchises(Set<Franchise> franchises) {
        this.franchises = franchises;
    }

}