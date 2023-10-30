package org.rmm.service.factory;

import org.rmm.entity.Alarm;
import org.rmm.entity.Threshold;
import org.rmm.enums.Category;
import org.rmm.service.AlarmService;
import org.springframework.stereotype.Component;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class AlarmGenerator {

    private final SystemInfo systemInfo;

    private final AlarmService alarmService;

    public AlarmGenerator(SystemInfo systemInfo, AlarmService alarmService) {
        this.systemInfo = systemInfo;
        this.alarmService = alarmService;
    }


    public Alarm generateCpuLoadAlarm(Threshold threshold) {
        HardwareAbstractionLayer hal = systemInfo.getHardware();
        Integer percentage = threshold.getPercentage();
        double cpuLoad = hal.getProcessor().getSystemCpuLoad();
        Alarm alarm = new Alarm();
        if(cpuLoad > percentage){

            alarm.setDate(new Date());
            if(threshold.getDays() != null){
                Calendar cal = Calendar.getInstance();
                cal.add(Calendar.DATE, -threshold.getDays());
                List<Alarm> alarms = alarmService.findAlarmsByCategory(Category.CPU_LOAD);
               List<Alarm> generatedAlarmsAfterTheTime =  alarms.stream().
                       filter(obj -> obj.getDate().before(cal.getTime())).toList();

            }

        }
        return alarm;
    }
}
