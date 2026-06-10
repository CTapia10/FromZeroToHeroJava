package com.proyecto.spring.zerotoheroapp.utils;

import org.springframework.stereotype.Component;

import com.proyecto.spring.zerotoheroapp.models.Libros;

@Component
public class ValidaLibros {

    public Libros libro;

    public Boolean tituloValido(){
        
        return libro.getTitulo() !=null && !libro.getTitulo().isBlank();
    }
}
