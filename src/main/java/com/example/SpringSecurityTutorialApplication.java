package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringSecurityTutorialApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringSecurityTutorialApplication.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");

    }
}
