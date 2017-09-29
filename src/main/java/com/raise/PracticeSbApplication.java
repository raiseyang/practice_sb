package com.raise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.raise.mapper")
public class PracticeSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSbApplication.class, args);
    }
}
