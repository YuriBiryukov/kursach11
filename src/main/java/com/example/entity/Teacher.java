package com.example.entity;

import com.example.dto.PersonDto;
import com.example.dto.TeacherDto;
import lombok.Data;

@Data


public class Teacher extends Cooperator {

    Integer hours; //количество часов

    public Teacher(Integer id, String surname, String name, Integer age, Integer experience, Integer salary, Integer hours) {
        super(id, surname, name, age, experience, salary);
        this.hours = hours;
    }


    @Override
    public PersonDto mapping() {
        TeacherDto teacherDto = new TeacherDto();
        super.map(this, teacherDto);
        teacherDto.setCountHours(this.getHours());
        return teacherDto;
    }
}
