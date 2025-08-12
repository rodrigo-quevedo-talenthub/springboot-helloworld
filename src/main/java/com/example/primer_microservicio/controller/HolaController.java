package com.example.primer_microservicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/hola")
    public String holaGetController(){
        return "Hola 👋";
    }
}
