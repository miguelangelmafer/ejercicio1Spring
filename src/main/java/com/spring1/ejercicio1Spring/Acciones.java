package com.spring1.ejercicio1Spring;

import org.springframework.web.bind.annotation.*;

@RestController()

public class Acciones {

    @GetMapping("/user/{nombre}")
    public String Saludo(@PathVariable("nombre")  String nombre){
        return "Hola " + nombre;
    }

    @PostMapping("/useradd")
    public Persona datos(@RequestBody Persona p){
        int edad = p.getEdad();
        p.setEdad(edad+1);
        return p ;

    }

}
