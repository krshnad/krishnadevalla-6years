package com.yourtaxi.service.demo.service;

import com.yourtaxi.service.demo.model.Booking;
import com.yourtaxi.service.demo.model.Car;

public interface BookingService {

    Car bookRide(Booking booking);
}
