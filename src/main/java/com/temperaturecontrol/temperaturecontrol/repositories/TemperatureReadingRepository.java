package com.temperaturecontrol.temperaturecontrol.repositories;

import com.temperaturecontrol.temperaturecontrol.models.TemperatureReading;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureReadingRepository extends JpaRepository<TemperatureReading, Long> {
}
