package com.example.dto;

import com.example.entity.Manager;
import lombok.Data;

@Data
public class ManagerDto extends CooperatorDto {

    Integer countSubordinates;

    public String toString() {
        return super.toString() + String.format("Количество подчиненных %d    \n", countSubordinates);
    }
}
