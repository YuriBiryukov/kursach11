package com.example.dto;

import lombok.Data;

@Data
public class TeacherDto extends CooperatorDto {

    Integer countHours; //количество часов

    public String toString() {
        return super.toString() + "Количество часов " + countHours + "    \n";
    }

}
