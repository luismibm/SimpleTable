package com.luismibm.SimpleTable.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity @Table(name = "PROVINCE")
public class Province {

    @Id
    private long id;
    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    @ManyToOne @JoinColumn(name = "country_id")
    private Country country;

    public Province() {

    }

    public Province(long id, String name, Country country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
