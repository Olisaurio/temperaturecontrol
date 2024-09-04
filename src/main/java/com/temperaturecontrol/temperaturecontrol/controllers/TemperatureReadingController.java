package com.temperaturecontrol.temperaturecontrol.controllers;

import com.temperaturecontrol.temperaturecontrol.models.TemperatureReading;
import com.temperaturecontrol.temperaturecontrol.services.TemperatureReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/readings")
public class TemperatureReadingController {
    @Autowired
    private TemperatureReadingService temperatureReadingService;

    @GetMapping
    public List<TemperatureReading> getAllReadings() {
        return temperatureReadingService.getAllReadings();
    }

    @PostMapping
    public TemperatureReading saveReading(@RequestBody TemperatureReading reading) {
        return temperatureReadingService.saveReading(reading);
    }

    @GetMapping("/{id}")
    public TemperatureReading getReadingById(@PathVariable Long id) {
        return temperatureReadingService.getReadingById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReading(@PathVariable Long id) {
        temperatureReadingService.deleteReading(id);
    }
}