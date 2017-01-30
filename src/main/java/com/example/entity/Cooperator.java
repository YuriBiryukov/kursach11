package com.example.entity;

import com.example.dto.CooperatorDto;
import com.example.dto.PersonDto;
import lombok.Data;

@Data


public abstract class Cooperator extends Person {

    Integer salary; // зарплата
    Integer experience; // стаж

    Cooperator(Integer id, String surname, String name, Integer age, Integer experience, Integer salary) {
        super(id, surname, name, age);
        this.experience = experience;
        this.salary = salary;
    }

    @Override
    void map(Person person, PersonDto personDto) {
        personDto.setName(person.getName());
        personDto.setAge(person.getAge());
        personDto.setSurname(person.getSurname());
        ((CooperatorDto) personDto).setExperience(((Cooperator) person).getExperience());
    }


}
