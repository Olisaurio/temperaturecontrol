package com.temperaturecontrol.temperaturecontrol.repositories;

import com.temperaturecontrol.temperaturecontrol.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
