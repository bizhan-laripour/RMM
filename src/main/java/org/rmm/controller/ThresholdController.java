package org.rmm.controller;

import org.rmm.entity.Threshold;
import org.rmm.repository.ThresholdRepository;
import org.rmm.service.ThresholdService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/threshold/")
public class ThresholdController extends GenericController<ThresholdService , Threshold , ThresholdRepository>{


    public ThresholdController(ThresholdService service) {
        super(service);
    }
}
