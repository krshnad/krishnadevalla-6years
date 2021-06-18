package com.yourtaxi.service.demo.controller;

import com.yourtaxi.service.demo.model.Booking;
import com.yourtaxi.service.demo.model.Car;
import com.yourtaxi.service.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value  = "/api/v1/booking")
public class BookingController {

    @Autowired
    BookingService service;

    @GetMapping(path="/healthCheck")
    public String getApiDetails() {
        return "Works!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car createBooking(@RequestBody Booking booking) {
        return service.bookRide(booking);
    }

}
