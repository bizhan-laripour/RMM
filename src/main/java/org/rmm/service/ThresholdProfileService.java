package org.rmm.service;

import org.rmm.entity.Threshold;
import org.rmm.entity.ThresholdProfile;
import org.rmm.repository.ThresholdProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThresholdProfileService extends GenericService<ThresholdProfile , ThresholdProfileRepository>{


    public ThresholdProfileService(ThresholdProfileRepository repository) {
        super(repository);
    }
}
