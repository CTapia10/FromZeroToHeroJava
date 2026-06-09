package com.proyecto.spring.zerotoheroapp.services;

import java.util.List;
import java.util.Optional;

import com.proyecto.spring.zerotoheroapp.models.Libros;

public interface IServicioLibro {
    List<Libros> ObtenerTodos();
    Optional<Libros>obtenerPorId(Long id);
    Libros guardar(Libros libro);
    void eliminaPorId(Long id);
    String buscaLibroPorTitulo(String titulo);

}
