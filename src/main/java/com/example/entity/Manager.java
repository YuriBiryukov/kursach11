package com.example.entity;

import com.example.dto.ManagerDto;
import com.example.dto.PersonDto;
import lombok.Data;

@Data
public class Manager extends Cooperator {

    Integer countCooperator;

    public Manager(Integer id, String surname, String name, Integer age, Integer experience, Integer salary, Integer countCooperator) {
        super(id, surname, name, age, experience, salary);
        this.countCooperator = countCooperator;
    }

    @Override
    public PersonDto mapping() {
        ManagerDto directorDto = new ManagerDto();
        super.map(this, directorDto);
        directorDto.setCountSubordinates(this.getCountCooperator());
        return directorDto;
    }
}
