package com.mitrais.jpq1.demojpa.model;

import com.sun.org.glassfish.gmbal.ManagedAttribute;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {

    @Id
    private int item_id;

    private String name;
    private String description;
    private int exchange_rate;
    private int total_item;
    private boolean auto_approve;
    private boolean on_sale;
    private int sold;

    @ManyToMany
    @JoinTable(
            name = "item_bazaar",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "bazaar_id")
    )
    private Set<Bazaar> item_bazaar;


}
