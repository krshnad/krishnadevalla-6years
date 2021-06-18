package com.yourtaxi.service.demo.service.impl;

import com.yourtaxi.service.demo.model.Driver;
import com.yourtaxi.service.demo.model.Location;
import com.yourtaxi.service.demo.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public Driver findDriverById(long driverId) {
        return null;
    }

    @Override
    public void updateLocation(long driverId, double longitude, double latitude) {

    }

    @Override
    public void delete(long driverId) {

    }

    @Override
    public Driver createDriver(Driver driver) {
        return null;
    }

    @Override
    public List<Driver> findDriverByAvailability() {
        return null;
    }

    @Override
    public List<Driver> findDriverByAvailabilityAndLocation(Location location) {
        return null;
    }
}
