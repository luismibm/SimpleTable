package com.luismibm.SimpleTable.model;

import jakarta.persistence.*;

@Entity @Table(name = "cities")
public class City {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false)
    String name;
    int residentAmount;
    String description;
    String image;

    public City() {
    }

    public City(long id, String name, int residentAmount, String description, String image) {
        this.id = id;
        this.name = name;
        this.residentAmount = residentAmount;
        this.description = description;
        this.image = image;
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

    public int getResidentAmount() {
        return residentAmount;
    }

    public void setResidentAmount(int residentAmount) {
        this.residentAmount = residentAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}