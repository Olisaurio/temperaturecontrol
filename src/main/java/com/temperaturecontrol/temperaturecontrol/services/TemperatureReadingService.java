package com.temperaturecontrol.temperaturecontrol.services;

import com.temperaturecontrol.temperaturecontrol.models.TemperatureReading;
import com.temperaturecontrol.temperaturecontrol.repositories.TemperatureReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemperatureReadingService {
    @Autowired
    private TemperatureReadingRepository temperatureReadingRepository;

    public List<TemperatureReading> getAllReadings() {
        return temperatureReadingRepository.findAll();
    }

    public TemperatureReading saveReading(TemperatureReading reading) {
        return temperatureReadingRepository.save(reading);
    }

    public TemperatureReading getReadingById(Long id) {
        return temperatureReadingRepository.findById(id).orElse(null);
    }

    public void deleteReading(Long id) {
        temperatureReadingRepository.deleteById(id);
    }
}
