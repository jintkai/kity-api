package com.jon.kity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.jon.kity.dao")

public class KityApplication {

    public static void main(String[] args) {
        SpringApplication.run(KityApplication.class, args);
    }
}
