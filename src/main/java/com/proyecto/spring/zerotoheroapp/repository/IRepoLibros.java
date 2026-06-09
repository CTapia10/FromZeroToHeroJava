package com.proyecto.spring.zerotoheroapp.repository;

import java.util.List;
import java.util.Optional;

import com.proyecto.spring.zerotoheroapp.models.Libros;

public interface IRepoLibros {
    List<Libros> findAll();
    Optional<Libros> findById(Long id);
    void save(Libros libro);
    void deleteById(Long id);
}
