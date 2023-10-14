package org.example;

import com.github.cb372.metrics.sigar.SigarMetrics;
import org.example.dto.SystemResultDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OSFileStore;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class MyTest {

    public static void main(String[] args) {
        SpringApplication.run(MyTest.class , args);

    }
}
