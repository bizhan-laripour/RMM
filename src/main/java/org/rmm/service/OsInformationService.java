package org.rmm.service;

import org.rmm.dto.SystemResultDto;
import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class OsInformationService {


    public SystemResultDto getOsTotalInfo(){
        SystemInfo si = new SystemInfo();
        SystemResultDto systemResultDto = new SystemResultDto();
        HardwareAbstractionLayer hal = si.getHardware();
        systemResultDto.setCentralProcessorInfo(hal.getProcessor());
        systemResultDto.setMemoryInfo(hal.getMemory());
        systemResultDto.setFileStoresInfo(Arrays.stream(hal.getFileStores()).collect(Collectors.toList()));
        systemResultDto.setDisplaysInfo(Arrays.stream(hal.getDisplays()).collect(Collectors.toList()));
        systemResultDto.setSensorsInfo(hal.getSensors());
        systemResultDto.setPowerSourcesInfo(Arrays.stream(hal.getPowerSources()).collect(Collectors.toList()));
        return systemResultDto;
    }
}
