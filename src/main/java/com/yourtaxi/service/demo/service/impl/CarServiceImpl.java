package com.yourtaxi.service.demo.service.impl;

import com.yourtaxi.service.demo.model.Car;
import com.yourtaxi.service.demo.service.CarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public Car findCarById(long carId) {
        return null;
    }

    @Override
    public void delete(long carId) {

    }

    @Override
    public Car createCar(Car car) {
        return null;
    }

    @Override
    public List<Car> findCarsByAvailability() {
        return null;
    }

    @Override
    public List<Car> findCarsByAvailabilityAndType(String type) {
        return null;
    }
}
