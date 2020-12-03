package com.qc.cicada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.qc.api"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CicadaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicadaApplication.class, args);
    }

}