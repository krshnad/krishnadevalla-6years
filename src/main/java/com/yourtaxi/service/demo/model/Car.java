package com.yourtaxi.service.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car
{
    private Long id;

    private Float rating;

    private String licensePlate;

    private Integer seatCount;

    private String type;

}
