package com.mitrais.jpq1.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Freezer   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public List<Carrot> getCarrot() {
        return carrot;
    }

    public void setCarrot(List<Carrot> carrot) {
        this.carrot = carrot;
    }

    @OneToMany
    @JoinColumn(name = "freezer_id")
    private List<Carrot> carrot;

    public Freezer() {
    }

    public Freezer(int id, String name) {
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
