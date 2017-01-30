package com.example.dto;

import lombok.Data;

@Data


public abstract class CooperatorDto extends PersonDto {

    Integer experience;

    public String toString() {
        return super.toString() + String.format("Стаж %d    \n", experience);
    }


}
