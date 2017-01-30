package com.example.dto;

import lombok.Data;

@Data

public class StudentDto extends PersonDto {
    String group;
    Integer numberRecordBook;


    public String toString() {
        return super.toString() + String.format("Группа %s    Номер зачетки %d    \n", group, numberRecordBook);
    }


}
