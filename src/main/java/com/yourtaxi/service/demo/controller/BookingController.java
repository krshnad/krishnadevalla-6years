package com.yourtaxi.service.demo.controller;

import com.yourtaxi.service.demo.model.Booking;
import com.yourtaxi.service.demo.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/booking")
public class BookingController {

    final
    BookingService service;

    public BookingController(BookingService service) {
        this.service = service;
    }

    @GetMapping(path = "/healthCheck")
    public String getApiDetails() {
        return "Works!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Booking createBooking(@RequestBody Booking booking) {
        return service.bookRide(booking);
    }

}
