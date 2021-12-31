package com.thunder.learn.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.thunder.learn.controller", "com.thunder.learn.configuration",
        "com.thunder.learn.service", "com.thunder.learn.repository"})
@EntityScan("com.thunder.learn.vo")
@EnableJpaRepositories("com.thunder.learn.repository")
public class LearnApp {

    public static void main(String[] args) {
        SpringApplication.run(LearnApp.class, args);
    }

}
