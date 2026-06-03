package com.proyecto.spring.zerotoheroapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.zerotoheroapp.models.Libros;
import com.proyecto.spring.zerotoheroapp.repository.RepoLibros;
import com.proyecto.spring.zerotoheroapp.services.ServicioLibro;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro libroServicio;
    private final RepoLibros libroRepositorio;

    public ControladorLibreria(ServicioLibro libroServicio, RepoLibros libroRepositorio) {
        this.libroServicio = libroServicio;
        this.libroRepositorio = libroRepositorio;
    }

    @GetMapping("/{titulo}")
    public String DameLibro(@PathVariable String titulo) {
        return libroServicio.buscaLibro(titulo);
    }
    
    @GetMapping("/todos")
    public List<Libros>dimeTodos(){
        return libroRepositorio.findAll();
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Libros>buscaId(@PathVariable Long id) {
        return libroRepositorio.BuscaId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    
    }
    


}
