package com.mitrais.jpq1.demojpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrot {
    @Id
    private int id;
    private boolean isFrozen;

    public Carrot() {
    }

    public Carrot(int id, boolean isFrozen) {
        this.id = id;
        this.isFrozen = isFrozen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }
}
