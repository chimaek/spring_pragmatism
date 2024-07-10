package net.chimaek.pragmatism_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"net.chimaek.pragmatism_spring"})
public class PragmatismSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(PragmatismSpringApplication.class, args);
    }

}