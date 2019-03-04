package com.mitrais.jpq1.demojpa.model;

import javax.persistence.*;

@Entity
public class Carrot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "freeze_status")
    private boolean freezeStatus;

    public int getBasketId() {
        return basketId;
    }

    public void setBasketId(int basket_id) {
        this.basketId = basket_id;
    }

    @Column(name = "basket_id")
    private int basketId;

    @Column(name = "freezer_id")
    private int freezerId;

    public boolean isFreezeStatus() {
        return freezeStatus;
    }

    public Carrot() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getFreezeStatus() {
        return freezeStatus;
    }

    public void setFreezeStatus(boolean freezeStatus) {
        this.freezeStatus = freezeStatus;
    }
}
