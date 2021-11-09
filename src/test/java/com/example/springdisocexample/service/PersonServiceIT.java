package com.example.springdisocexample.service;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.repo.PersonRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * For this test we want the PersonRepo to be injected by the containers so we use the
 * @SpringBootTest to create an integration test that wires the application together in
 * the way that it would work during production.
 *
 * Spring creates the container injects the objects and we can make our assertions against the return data.
 *
 * If, for example, the personrepo had to use a database we could easily query the database and make assertions against
 * the returned data.
 *
 * This example is a bit contrived but it demonstrates that the @SpringBootTest annotations allows us to not only
 * wire together our dependencies but also, if necessary, make network called and return those objects for testing
 */
@SpringBootTest
public class PersonServiceIT {

    @Autowired
    PersonService personService;

    @Test
    public void shouldFindTwoLegalDrinkers() {
        List<Person> legalDrinkers = personService.findLegalDrinkers();

        assertTrue(legalDrinkers.size() == 2);
    }
}
