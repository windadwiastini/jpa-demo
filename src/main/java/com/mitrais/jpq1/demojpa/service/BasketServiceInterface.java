package com.mitrais.jpq1.demojpa.service;

import com.mitrais.jpq1.demojpa.model.Basket;

import java.util.List;

public interface BasketServiceInterface {
    List<Basket> findAllBaskets();
    void deleteBasketById(int id);
    void editBasket(int id, String name, int employee_id);
    void createBasket(Basket basket);
}
