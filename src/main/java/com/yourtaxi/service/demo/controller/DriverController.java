package com.yourtaxi.service.demo.controller;

import com.yourtaxi.service.demo.model.Driver;
import com.yourtaxi.service.demo.model.Location;
import com.yourtaxi.service.demo.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/drivers")
public class DriverController {

    final
    DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/{driverId}")
    public Driver getDriver(@PathVariable long driverId) {
        return this.driverService.findDriverById(driverId);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }

    @PutMapping("/{driverId}")
    public void updateLocation(
            long driverId, @RequestParam double longitude, @RequestParam double latitude) {
        driverService.updateLocation(driverId, longitude, latitude);
    }

    @GetMapping("/drivers")
    public List<Driver> getDriverByAvailability() {
        return this.driverService.findDriverByAvailability();
    }

    @GetMapping("/drivers/location/{location}")
    public List<Driver> getDriverByAvailabilityAndLocation(@PathVariable Location location) {
        return this.driverService.findDriverByAvailabilityAndLocation(location);
    }


}
