package com.jon.kity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class KityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KityApplication.class, args);
    }
}
