package com.yourtaxi.service.demo.service;

import com.yourtaxi.service.demo.model.Car;

import java.util.List;

public interface CarService {
    Car findCarById(long carId);

    void delete(long carId);

    Car createCar(Car car);

    List<Car> findCarsByAvailability();

    List<Car> findCarsByAvailabilityAndType(String type);
}
