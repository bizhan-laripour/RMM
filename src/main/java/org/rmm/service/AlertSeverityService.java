package org.rmm.service;

import org.rmm.entity.AlertSeverity;
import org.rmm.repository.AlertSeverityRepository;
import org.springframework.stereotype.Service;

@Service
public class AlertSeverityService extends GenericService<AlertSeverity , AlertSeverityRepository> {

    public AlertSeverityService(AlertSeverityRepository repository) {
        super(repository);
    }
}
