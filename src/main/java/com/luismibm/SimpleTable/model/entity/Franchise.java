package com.luismibm.SimpleTable.model.entity;

import jakarta.persistence.*;

@Entity @Table(name = "FRANCHISE")
public class Franchise {

    @Id
    private long id;
    private String name;

    // @ManyToMany

    public Franchise() { }

    public Franchise(long id, String name) {
        this.id = id;
        this.name = name;
    }

}
