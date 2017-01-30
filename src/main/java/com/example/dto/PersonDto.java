package com.example.dto;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope(value = "prototype")
public abstract class PersonDto {

    String surname;
    String name;
    int age;

    public PersonDto() {
    }

    public String toString() {
        return String.format(" Имя %s    Фамилия %s  Возраст %d    \n", name, surname, age);
    }

}

