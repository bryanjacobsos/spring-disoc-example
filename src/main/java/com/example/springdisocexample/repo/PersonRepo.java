package com.example.springdisocexample.repo;

import com.example.springdisocexample.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class PersonRepo {

    public static final Map<Integer, Person> INTEGER_TO_PERSON = Map.of(
            1, Person.person(1, "bob", "smith", 17),
            2, Person.person(2, "jane", "jackson", 23),
            3, Person.person(3, "jack", "goober", 44)
    );

    public Person getById(Integer id) {

        // pretend database :)
        Map<Integer, Person> integerToPerson = INTEGER_TO_PERSON;

        return integerToPerson.get(id);

    }

    public List<Person> getAll(){
        return new ArrayList<>(INTEGER_TO_PERSON.values());
    }



}
