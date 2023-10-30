package org.rmm;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import oshi.SystemInfo;

@SpringBootApplication
public class MyTest extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyTest.class , args);

    }


    @Bean
    public SystemInfo systemInfo(){
        return new SystemInfo();
    }


    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

}
