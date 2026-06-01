package com.proyecto.spring.zerotoheroapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.zerotoheroapp.services.ServicioLibro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro libroServicio;

    public ControladorLibreria(ServicioLibro libroServicio) {
        this.libroServicio = libroServicio;
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo) {
        return libroServicio.buscaLibro(titulo);
    }
    
}
