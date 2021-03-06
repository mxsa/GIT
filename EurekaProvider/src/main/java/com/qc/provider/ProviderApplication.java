package com.qc.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@Slf4j
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.qc.provider.mapper")
public class ProviderApplication {

    public static void main(String[] args) {
        log.info("EurekaProvider Started...");
        SpringApplication.run(ProviderApplication.class, args);
        log.info("EurekaProvider Success...");
    }

}
