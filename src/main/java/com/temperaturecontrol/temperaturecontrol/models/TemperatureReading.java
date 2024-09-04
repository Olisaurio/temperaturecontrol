package com.temperaturecontrol.temperaturecontrol.models;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class TemperatureReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double temperature;
    private Date readingTime;
    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    // Getters y Setters
}
