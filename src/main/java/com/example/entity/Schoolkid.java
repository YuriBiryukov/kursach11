package com.example.entity;

import com.example.dto.PersonDto;
import com.example.dto.SchoolkidDto;
import lombok.Data;

@Data

public class Schoolkid extends Person {

    String Number; // класс
    Double progress; // средняя успеваемость

    public Schoolkid(Integer id, String surname, String name, Integer age, Double progress, String classNumber) {
        super(id, surname, name, age);
        this.progress = progress;
        this.Number = classNumber;
    }


    @Override
    public PersonDto mapping() {
        SchoolkidDto schoolkidDto = new SchoolkidDto();
        super.map(this, schoolkidDto);
        schoolkidDto.setClassNumber(this.getNumber());
        return schoolkidDto;
    }
}
