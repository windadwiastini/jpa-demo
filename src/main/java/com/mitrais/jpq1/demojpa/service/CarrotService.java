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

    public List<Carrot> findAllCriteria(){
        return carrotRepository.getCarrot();
    }

    @Override
    public void deleteCarrotById(int id) {
        carrotRepository.deleteCarrot(id);
    }

    @Override
    public void editCarrot(int id, boolean status) {
        carrotRepository.editCarrot(id,status);
    }

    @Override
    public void createCarrot(boolean status) {
        carrotRepository.addCarrot(status);
    }
}
