package com.temperaturecontrol.temperaturecontrol.services;

import com.temperaturecontrol.temperaturecontrol.models.Device;
import com.temperaturecontrol.temperaturecontrol.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    private DeviceRepository deviceRepository;

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Device saveDevice(Device device) {
        return deviceRepository.save(device);
    }

    public Device getDeviceById(Long id) {
        return deviceRepository.findById(id).orElse(null);
    }

    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }
}
