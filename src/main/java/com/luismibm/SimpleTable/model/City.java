package com.luismibm.SimpleTable.model;

import jakarta.persistence.*;

@Entity @Table(name = "CITY")
public class City {

    @Id
    private long id;
    private String name;

    @ManyToOne @JoinColumn(name = "province_id")
    private Province province;

    public City() {
    }

    public City(long id, String name, Province province) {
        this.id = id;
        this.name = name;
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

}