package com.example.springdisocexample.rest;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This creates a simple rest api using spring boot
 *
 * The @RestController creates an endpoint that is accessible from:
 * http://localhost:8080/person/{id}
 *
 * Run the:
 * SpringDisocExampleApplication from the build or your IDE
 */
@RestController
@RequestMapping(path="person")
public class PersonRest {

    private PersonService personService;

    /**
     * The @Autowired annotation allows you to inject a dependency into the constructor. This means that
     * spring will create and pass the object into the constructor for you.
     *
     * Additionally, it's possible to put the @Autowired on the PersonService class variable and then the constructor
     * can be removed.
     * @param personService
     */
    @Autowired
    public PersonRest(PersonService personService) {
        this.personService = personService;
    }

    /**
     * once the application is running you can invoke this method over http from your browser like this:
     *
     * http://localhost:8080/person/1
     *
     * and you will get a json response
     * @param id
     * @return
     */
    @GetMapping(path = "/{id}")
    public Person getPersonById(@PathVariable Integer id) {
        return personService.getById(id);
    }

}
