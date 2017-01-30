package com.example.controller;

import com.example.dto.PersonDto;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persons")
public class PersonController {


    @Autowired
    PersonService service;

    @GetMapping(value = "/id{1}")
    public String read(@PathVariable Integer id) {

        return service.get(id).toString();
    }

    @GetMapping(value = "/id{2}")
    public String read2(@PathVariable Integer id) {

        return service.get(id).toString();
    }

    @GetMapping(value = "/id{3}")
    public String read3(@PathVariable Integer id) {

        return service.get(id).toString();
    }

    @GetMapping
    public String readALL( ) {

        String s="";
        for (PersonDto personDto : service.getAll()) {
            s+=personDto.toString();
        }
        return s;
    }






}
