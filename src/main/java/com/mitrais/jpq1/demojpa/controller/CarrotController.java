package com.mitrais.jpq1.demojpa.controller;

import com.mitrais.jpq1.demojpa.model.Carrot;
import com.mitrais.jpq1.demojpa.service.CarrotService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/criteria")
    public List<Carrot> criteria(){return carrotService.findAllCriteria();}

    @DeleteMapping("{id}")
    public void deleteCarrotById(@PathVariable int id){
            carrotService.deleteCarrotById(id);
    }

    @PostMapping
    public void createCarrot(@RequestBody Carrot carrot){
        carrotService.createCarrot(carrot.getFreezeStatus());
    }

    @PatchMapping("{id}")
    public void patchCarrot(@PathVariable int id, @RequestBody Carrot carrot){
        carrotService.editCarrot(id,carrot.getFreezeStatus());
    }
}
