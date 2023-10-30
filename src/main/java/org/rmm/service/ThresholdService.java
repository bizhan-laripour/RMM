package org.rmm.service;

import org.rmm.entity.Threshold;
import org.rmm.repository.ThresholdRepository;
import org.springframework.stereotype.Service;



@Service
public class ThresholdService extends GenericService<Threshold , ThresholdRepository>{


    public ThresholdService(ThresholdRepository repository) {
        super(repository);
    }
}
