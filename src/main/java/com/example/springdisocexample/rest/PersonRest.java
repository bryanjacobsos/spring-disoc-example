package com.example.springdisocexample.rest;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRest {


    private PersonService personService;

    @Autowired
    public PersonRest(PersonService personService) {
        this.personService = personService;
    }

    public Person getPersonById(Integer id) {
        return personService.getById(id);
    }

}
