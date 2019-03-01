package com.mitrais.jpq1.demojpa.controller;

import com.mitrais.jpq1.demojpa.model.Carrot;
import com.mitrais.jpq1.demojpa.service.CarrotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/carrots")
public class CarrotController {

    private CarrotService carrotService;

    public CarrotController(CarrotService carrotService) {
        this.carrotService = carrotService;
    }

    @GetMapping
    public List<Carrot> findAllCarrot() {
        return carrotService.findAllCarrots();
    }
}
