package org.rmm.controller;

import org.rmm.entity.Device;
import org.rmm.repository.DeviceRepository;
import org.rmm.service.DeviceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/device/")
public class DeviceController extends GenericController<DeviceService , Device, DeviceRepository>  {
    public DeviceController(DeviceService service) {
        super(service);
    }
}
