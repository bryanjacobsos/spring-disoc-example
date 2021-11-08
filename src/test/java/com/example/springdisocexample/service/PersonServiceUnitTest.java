package com.example.springdisocexample.service;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.repo.PersonRepo;
import org.junit.jupiter.api.Test;

import static com.example.springdisocexample.model.Person.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonServiceUnitTest {

    /**
     * Provide an example of how dependency injection makes testing easier, and allows the tester
     * to configure state that is more appropriate for the test.
     *
     * The ability for tests to mock out dependencies can be very powerful and allow you to put a particular
     * piece of code in a desired state. However, it's important to remember the integration tests are extremely
     * important because without a good suite of integration tests the application may appear to work with unit test
     * coverage but still fail to work because it's integration have not been properly tested.
     */
    @Test
    public void shouldGetGeorge() {


        // because the person service uses dependency injection
        // its possible to pass in a different implementation of the PersonRepo
        // if that is needed.
        // The BadPersonRepo makes that impossible because it creates its own reference
        PersonService personService = new PersonService(new PersonRepoMock());

        Person george = personService.getById(1);

        assertEquals(george.getFirstName(), "george");

    }


    private class PersonRepoMock extends PersonRepo {

        @Override
        public Person getById(Integer id) {
            return person(1, "george", "smith", 22);
        }

    }

}
