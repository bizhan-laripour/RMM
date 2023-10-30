package org.rmm.controller;

import org.rmm.entity.Alarm;
import org.rmm.repository.AlarmRepository;
import org.rmm.service.AlarmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alarm/")
public class AlarmController extends GenericController<AlarmService , Alarm , AlarmRepository>{

    public AlarmController(AlarmService service) {
        super(service);
    }
}
