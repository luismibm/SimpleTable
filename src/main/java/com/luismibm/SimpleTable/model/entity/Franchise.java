package com.luismibm.SimpleTable.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity @Table(name = "FRANCHISE")
public class Franchise {

    @Id
    private long id;
    private String name;

    @ManyToMany(mappedBy = "franchises")
    Set<City> cities;

    public Franchise() { }

    public Franchise(long id, String name) {
        this.id = id;
        this.name = name;
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

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

}