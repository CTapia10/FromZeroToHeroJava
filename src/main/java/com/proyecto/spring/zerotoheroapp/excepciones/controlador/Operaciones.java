package com.proyecto.spring.zerotoheroapp.excepciones.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/division")
public class Operaciones {

    @GetMapping
    public String Divide(){
        int valor = 20/0;
        return "resultado: " + valor;
    }
}
