package com.mitrais.jpq1.demojpa.service;

import com.mitrais.jpq1.demojpa.model.Carrot;
import com.mitrais.jpq1.demojpa.repository.CarrotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrotService implements CarrotServiceInterface {

    private CarrotRepository carrotRepository;

    public CarrotService(CarrotRepository carrotRepository) {
        this.carrotRepository = carrotRepository;
    }

    @Override
    public List<Carrot> findAllCarrots() {

        return carrotRepository.findAllCarrot();
    }
}
