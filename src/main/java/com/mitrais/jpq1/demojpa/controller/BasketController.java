package com.mitrais.jpq1.demojpa.controller;

import com.mitrais.jpq1.demojpa.model.Basket;
import com.mitrais.jpq1.demojpa.model.Carrot;
import com.mitrais.jpq1.demojpa.service.BasketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/baskets")
public class BasketController {

    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping
    public List<Basket> findAllBasket() {
        return basketService.findAllBaskets();
    }

    @PostMapping
    public void createCarrot(@RequestBody Basket basket){
        basketService.createBasket(basket);
    }
}
