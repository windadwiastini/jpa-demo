package com.mitrais.jpq1.demojpa.service;

import com.mitrais.jpq1.demojpa.model.Carrot;

import java.util.List;

public interface CarrotServiceInterface {
    List<Carrot> findAllCarrots();
    void deleteCarrotById(int id);
    void editCarrot(int id, boolean status);
    void createCarrot(boolean status);
}
