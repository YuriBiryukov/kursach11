package com.example.service;


import com.example.dto.PersonDto;
import com.example.entity.Person;

import java.util.List;

public interface PersonService {
    PersonDto get(Integer id);

    List<PersonDto> getAll();

    void personAdd(Person person);

}
