package com.monfamily.wow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MonFamilyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonFamilyApplication.class, args);
    }

}
