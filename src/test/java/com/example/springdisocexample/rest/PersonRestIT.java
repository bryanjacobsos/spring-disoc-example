package com.example.springdisocexample.rest;

import com.example.springdisocexample.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This test class will create a server and deploy our code to it so that we can
 * make a rest api call to it and then assert that returned objects over http are what we expect
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonRestIT {

    @LocalServerPort
    Integer port;

    @Autowired
    RestTemplate restTemplate;

    /**
     * this time we are checking for bob
     */
    @Test
    public void shouldGetBob() {

        System.out.println(port + " *********************************************************************************");

        String testUrl = "http://localhost:" + port + "/person/1";

        ResponseEntity<Person> responseEntity = restTemplate.getForEntity(testUrl, Person.class);

        Person bob = responseEntity.getBody();

        assertEquals(bob.getFirstName(), "bob");

    }



}
