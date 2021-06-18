package com.yourtaxi.service.demo.service;

import com.yourtaxi.service.demo.model.Driver;
import com.yourtaxi.service.demo.model.Location;

import java.util.List;

public interface DriverService {
    Driver findDriverById(long driverId);

    void updateLocation(long driverId, double longitude, double latitude);

    void delete(long driverId);

    Driver createDriver(Driver driver);

    List<Driver> findDriverByAvailability();

    List<Driver> findDriverByAvailabilityAndLocation(Location location);
}
