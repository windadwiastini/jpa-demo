package com.mitrais.jpq1.demojpa.service;

import com.mitrais.jpq1.demojpa.model.Basket;
import com.mitrais.jpq1.demojpa.repository.BasketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService implements BasketServiceInterface {

    private BasketRepository basketRepository;

    public BasketService(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }


    @Override
    public List<Basket> findAllBaskets() {
        return basketRepository.findAllBaskets();
    }

    @Override
    public void deleteBasketById(int id) {

    }

    @Override
    public void editBasket(int id, String name, int employee_id) {

    }

    @Override
    public void createBasket(Basket basket) {
        basketRepository.addBasket(basket);
    }
}
