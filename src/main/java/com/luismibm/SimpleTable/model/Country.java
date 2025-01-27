package com.luismibm.SimpleTable.model;

import jakarta.persistence.*;

import java.util.List;

@Entity @Table(name = "COUNTRY")
public class Country {

    @Id
    private long id;
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Province> provinces;

    public Country() {

    }

    public Country(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}