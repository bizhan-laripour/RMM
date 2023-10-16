package org.rmm.controller;

import org.rmm.entity.ThresholdProfile;
import org.rmm.service.ThresholdProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThresholdProfileController {


    private final ThresholdProfileService service;

    public ThresholdProfileController(ThresholdProfileService service) {
        this.service = service;
    }


    @PostMapping("save")
    public ResponseEntity<?> save(ThresholdProfile thresholdProfile){
        return new ResponseEntity<>(service.saveThresholdProfile(thresholdProfile) , HttpStatus.OK);
    }
}
