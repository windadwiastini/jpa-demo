package com.mitrais.jpq1.demojpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true, name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @OneToMany
    @JoinColumn(name = "basket_id")
    private List<Carrot> carrot;

    public List<Carrot> getCarrot() {
        return carrot;
    }

    public void setCarrot(List<Carrot> carrot) {
        this.carrot = carrot;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    private int employee_id;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

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
