package com.proyecto.spring.zerotoheroapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.proyecto.spring.zerotoheroapp.models.Libros;
import com.proyecto.spring.zerotoheroapp.repository.IRepoLibros;

@Service
public class ServicioLibro implements IServicioLibro {

    private final IRepoLibros irepo;

    public ServicioLibro(IRepoLibros irepo){
        this.irepo = irepo;
    }

    @Override
    public List<Libros> ObtenerTodos(){
        return irepo.findAll();
    }

    @Override
    public Optional<Libros> obtenerPorId(Long id) {
        return irepo.findById(id);
    }

    @Override
    public Libros guardar(Libros libro) {
        irepo.save(libro);
        return libro;
    }

    @Override
    public void eliminaPorId(Long id) {
        irepo.deleteById(id);
    }

    @Override
    public String buscaLibroPorTitulo(String titulo) {
        boolean encontrado = irepo.findAll().stream()
                .anyMatch(libros -> libros.getTitulo()
                        != null && libros.getTitulo().equalsIgnoreCase(titulo));
                return encontrado ? "Libro encontrado" : "Libro no encontrado";       
    }

    

}
