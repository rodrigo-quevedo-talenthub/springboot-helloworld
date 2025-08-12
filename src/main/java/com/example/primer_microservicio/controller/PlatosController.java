package com.example.primer_microservicio.controller;

import com.example.primer_microservicio.entities.Plato;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatosController {

    @CrossOrigin(origins = "*")
    @GetMapping("/platos")
    public List<Plato> getPlatosController(){
        return List.of(
                new Plato(1, "Salmón", 19.99f, "https://cdn.pixabay.com/photo/2015/04/08/13/13/food-712665_1280.jpg"),
                new Plato(2, "Torre de panqueques", 39.99f, "https://cdn.pixabay.com/photo/2017/03/13/13/39/pancakes-2139844_1280.jpg"),
                new Plato(3, "Pizza", 29.99f, "https://cdn.pixabay.com/photo/2021/09/28/15/21/pizza-6664791_1280.jpg"),
                new Plato(4, "Pasta", 14.99f, "https://cdn.pixabay.com/photo/2018/07/18/19/12/pasta-3547078_1280.jpg"),
                new Plato(5, "Hamburguesa", 19.99f, "https://cdn.pixabay.com/photo/2021/11/03/08/31/hamburger-6765033_1280.jpg"),
                new Plato(6, "Mila con fritas", 24.99f, "https://cdn.pixabay.com/photo/2020/03/22/17/35/steak-milanesa-4957919_960_720.jpg")
        );

    }





}
