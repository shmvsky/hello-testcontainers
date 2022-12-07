package ru.shmvsky.hellotestcontainers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class HelloTestcontainersApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloTestcontainersApplication.class, args);
    }

}
