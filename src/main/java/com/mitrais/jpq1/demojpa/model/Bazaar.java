package com.mitrais.jpq1.demojpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bazaar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bazaar_id;

    private String name;
    private boolean status;

    @ManyToMany (mappedBy = "item_bazaar")
    private Set<Item> bazaar_items;
}
