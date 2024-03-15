package com.NimappProject.Nimappproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("model")
@ComponentScan({"com.NimappProject.Nimappproject", "controller"})
public class NimappProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(NimappProjectApplication.class, args);
    }

}
