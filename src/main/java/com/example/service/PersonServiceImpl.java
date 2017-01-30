package com.example.service;

import com.example.dto.PersonDto;
import com.example.entity.Person;
import com.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository repository;

    @Override
    public PersonDto get(Integer id) {
        return repository.getOne(id).mapping();
    }

    @Override
    public List<PersonDto> getAll() {
        return repository.getAll().stream().map(Person::mapping).collect(Collectors.toList());
    }

    @Override
    public void personAdd(Person person) {
        repository.personAdd(person);
    }

}
