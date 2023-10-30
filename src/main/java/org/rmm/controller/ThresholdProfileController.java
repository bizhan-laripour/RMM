package org.rmm.controller;

import org.rmm.entity.ThresholdProfile;
import org.rmm.repository.ThresholdProfileRepository;
import org.rmm.service.ThresholdProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/threshold-profile/")
public class ThresholdProfileController extends GenericController<ThresholdProfileService, ThresholdProfile, ThresholdProfileRepository> {

    public ThresholdProfileController(ThresholdProfileService service) {
        super(service);
    }

}

