package com.example.springdisocexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * this class is the main method for the spring boot application
 * if you run this from your ide or from the maven build it will start a rest endpoint
 * that is accessible from the browser.
 *
 * It has a single endpoint that can be invoked like this:
 *
 * http://localhost:8080/person/1
 */
@SpringBootApplication
public class SpringDisocExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDisocExampleApplication.class, args);
    }

}
