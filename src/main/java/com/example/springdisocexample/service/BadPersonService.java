package com.example.springdisocexample.service;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.repo.PersonRepo;

/**
 * The reason that this is a BadPersonService is because the method creates its own instance of the PersonRepo.
 * This is not ideal because the method cannot change the behavior of the PersonRepo.
 *
 * If on the other hand the PersonRepo is passed into the BadPersonService by a DI framework like spring or
 * manually through a constructor it then becomes possible for the passed in dependency to be changed to suit
 * different needs.  Specifically testing.  See the testing example for the PersonServiceUnitTest.
 */
public class BadPersonService {


    public Person getById(Integer id) {

        PersonRepo personRepo = new PersonRepo();

        return personRepo.getById(id);

    }

}
