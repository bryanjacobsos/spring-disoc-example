package com.example.springdisocexample;

import com.example.springdisocexample.repo.PersonRepo;
import com.example.springdisocexample.rest.PersonRest;
import com.example.springdisocexample.service.PersonService;

public class NonSpringMain {

    public static void main(String[] args) {

        // even though we don't have the spring container we can manually inject the dependencies
        PersonRepo personRepo = new PersonRepo();

        PersonService personService = new PersonService(personRepo);

        // here we run into a problem in that we can't actually run the rest api without building something
        // simliar to spring boot
        PersonRest personRest = new PersonRest(personService);

    }

}
