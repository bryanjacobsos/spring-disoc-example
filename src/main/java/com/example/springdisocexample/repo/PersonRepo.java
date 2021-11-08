package com.example.springdisocexample.repo;

import com.example.springdisocexample.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class PersonRepo {

    public Person getById(Integer id) {

        // pretend database :)
        Map<Integer, Person> integerToPerson = Map.of(
                1, Person.person(1,"bob", "smith", 23),
                2, Person.person(2, "jane", "jackson", 23),
                3, Person.person(3, "jack", "goober", 44)
        );


        return integerToPerson.get(id);

    }

}
