package org.rmm.service;

import org.rmm.entity.Alarm;
import org.rmm.enums.Category;
import org.rmm.repository.AlarmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmService extends GenericService<Alarm , AlarmRepository>{


    public AlarmService(AlarmRepository repository) {
        super(repository);
    }

    public List<Alarm> findAlarmsByCategory(Category category){
        return findAlarmsByCategory(category);
    }
}
