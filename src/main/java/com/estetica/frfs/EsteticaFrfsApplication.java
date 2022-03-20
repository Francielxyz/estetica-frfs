package com.estetica.frfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.estetica.frfs.controller", "com.estetica.frfs.service",
        "com.estetica.frfs.repository", "com.estetica.frfs.exception" })
@EntityScan("com.estetica.frfs.entity")
@EnableJpaRepositories("com.estetica.frfs.repository")
public class EsteticaFrfsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsteticaFrfsApplication.class, args);
    }

}
