package org.rmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MyTest extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyTest.class , args);

    }

}
