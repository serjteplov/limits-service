package ru.serj.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ru.serj.limitsservice.Configuration.class)
public class  LimitsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LimitsServiceApplication.class, args);
    }

}
