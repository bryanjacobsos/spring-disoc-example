package com.example.springdisocexample.service;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.repo.PersonRepo;
import org.springframework.stereotype.Service;

@Service
public class PersonService {


    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    public Person getById(Integer id) {

        return personRepo.getById(id);
    }

}
