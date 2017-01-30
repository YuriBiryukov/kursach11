package com.example.repository;

import com.example.entity.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PersonRepository {
    private HashMap<Integer, Person> persons = new HashMap<>();

    PersonRepository() {
        personAdd(new Manager(1, "Gibkin", "Yuriy", 22, 24, 4653, 6434));
        personAdd(new Schoolkid(2, "Katomin", "Alexander", 23, 214.59, "11Б"));
        personAdd(new Teacher(3, "Petrov", "Sidor", 24, 15, 125, 2155));
    }

    private Integer maxId() {
        return persons.keySet().stream().max(Integer::compareTo).orElseGet(() -> 0);
    }

    public List<Person> getAll() {
        return persons.values().stream().collect(Collectors.toList());
    }

    public Person getOne(Integer id) {
        return persons.get(id);
    }

    public void personAdd(Person person) {
        persons.put(maxId() + 1, person);
    }

}
