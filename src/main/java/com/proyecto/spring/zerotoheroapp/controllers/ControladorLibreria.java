package com.proyecto.spring.zerotoheroapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.spring.zerotoheroapp.models.Libros;
import com.proyecto.spring.zerotoheroapp.repository.RepoLibros;
import com.proyecto.spring.zerotoheroapp.services.IServicioLibro;
import com.proyecto.spring.zerotoheroapp.services.ServicioLibro;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final IServicioLibro iservicio;

    public ControladorLibreria(IServicioLibro iservicio) {
        this.iservicio = iservicio;
    }

    @GetMapping("/todos")
    public List<Libros>listar(){
        return iservicio.ObtenerTodos();
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<Libros> obtenerPorId(@PathVariable Long id){
        Optional<Libros> libro = iservicio.obtenerPorId(id);
        return libro.map(ResponseEntity::ok).orElseGet(()->
                ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Libros>crear(@RequestBody Libros libro){
        iservicio.guardar(libro);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        iservicio.eliminaPorId(id);
        return ResponseEntity.noContent().build();
    }
    
    
    


}
