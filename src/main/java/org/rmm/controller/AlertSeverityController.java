package org.rmm.controller;

import org.rmm.entity.AlertSeverity;
import org.rmm.repository.AlertSeverityRepository;
import org.rmm.service.AlertSeverityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alert-severity/")
public class AlertSeverityController extends GenericController<AlertSeverityService , AlertSeverity , AlertSeverityRepository>{
    public AlertSeverityController(AlertSeverityService service) {
        super(service);
    }
}
