package org.rmm.service.factory;

import org.rmm.entity.Alarm;
import org.rmm.entity.Threshold;
import org.springframework.stereotype.Component;

@Component
public class AlarmFactory {

    private final AlarmGenerator alarmGenerator;

    public AlarmFactory(AlarmGenerator alarmGenerator) {
        this.alarmGenerator = alarmGenerator;
    }

    public Alarm createAlarm(Threshold threshold) {
        switch (threshold.getCategory()) {
            case CPU_LOAD -> {
                return alarmGenerator.generateCpuLoadAlarm(threshold);
            }
            default -> {
                return null;
            }
        }
    }
}
