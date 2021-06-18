package com.yourtaxi.service.demo.controller;

import com.yourtaxi.service.demo.model.Car;
import com.yourtaxi.service.demo.service.CarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/cars")
public class CarController {

    final
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{carId}")
    public Car getcar(@PathVariable long carId) {
        return this.carService.findCarById(carId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createcar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @ApiOperation(value = "Return all available cars")
    @GetMapping("/{cars}")
    public List<Car> getAvailableCars() {
        return carService.findCarsByAvailability();
    }

    @ApiOperation(value = "Return all available cars based on car type")
    @GetMapping("/{cars/type/{type}}")
    public List<Car> getAvailableCarsByType(@PathVariable("type") String type) {
        return carService.findCarsByAvailabilityAndType(type);
    }

}
