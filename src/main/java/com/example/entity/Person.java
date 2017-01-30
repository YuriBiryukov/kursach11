package com.example.entity;

import com.example.dto.PersonDto;
import lombok.Data;

@Data

public abstract class Person {

    Integer id;
    String surname;
    String name;
    Integer age;

    public Person(Integer id, String surname, String name, Integer age) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    void map(Person person, PersonDto personDto) {
        personDto.setName(person.getName());
        personDto.setAge(person.getAge());
        personDto.setSurname(person.getSurname());
    }

    public abstract PersonDto mapping();


}

