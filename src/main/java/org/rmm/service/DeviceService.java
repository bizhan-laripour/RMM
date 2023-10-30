package org.rmm.service;

import org.rmm.entity.Device;
import org.rmm.repository.DeviceRepository;
import org.springframework.stereotype.Service;

@Service
public class DeviceService extends GenericService<Device , DeviceRepository> {

    public DeviceService(DeviceRepository repository) {
        super(repository);
    }
}
