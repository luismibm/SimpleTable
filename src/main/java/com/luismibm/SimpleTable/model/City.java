package com.luismibm.SimpleTable.model;

import jakarta.persistence.*;

@Entity @Table(name = "CITY")
public class City {

    @Id
    private long id;
    private String name;
    private long provinceId;

    public City() {
    }

    public City(long id, String name, long provinceId) {
        this.id = id;
        this.name = name;
        this.provinceId = provinceId;
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

    public long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

}