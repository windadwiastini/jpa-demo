package com.mitrais.jpq1.demojpa.model;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String name;
    private String nickname;

    public Employee() {
    }

    public Employee(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public int getId() {
        return employee_id;
    }

    public void setId(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
