package com.example.springdisocexample.repo;

import com.example.springdisocexample.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * unit testing with or without the spring boot framework is basically tha same
 */
public class PersonRepoUnitTest {

    private static final PersonRepo personRepo = new PersonRepo();


    @Test
    public void shouldGetBob() {

        Person bob = personRepo.getById(1);

        assertEquals(bob.getFirstName(), "bob");

    }

}
