package org.rmm.service;

import org.rmm.entity.ThresholdProfile;
import org.rmm.repository.ThresholdProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ThresholdProfileService {

    private final ThresholdProfileRepository repository;

    public ThresholdProfileService(ThresholdProfileRepository repository) {
        this.repository = repository;
    }


    public ThresholdProfile saveThresholdProfile(ThresholdProfile thresholdProfile){
        return repository.save(thresholdProfile);
    }
}
