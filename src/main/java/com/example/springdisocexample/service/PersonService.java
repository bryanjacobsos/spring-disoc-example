package com.example.springdisocexample.service;

import com.example.springdisocexample.model.Person;
import com.example.springdisocexample.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Value("${us.drinking.age}")
    private Integer usDrinkingAge;


    private PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    public Person getById(Integer id) {

        return personRepo.getById(id);
    }

    public List<Person> findLegalDrinkers() {
        List<Person> people = personRepo.getAll();
        return people.stream().filter(person -> person.getAge() >= usDrinkingAge).collect(Collectors.toList());
    }

}
