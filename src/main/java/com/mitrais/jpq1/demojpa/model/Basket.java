package com.mitrais.jpq1.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Basket {
    @Id
    private int id;
    private String name;

    public Basket() {
    }

    public Basket(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
