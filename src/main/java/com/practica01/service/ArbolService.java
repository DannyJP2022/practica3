package com.practica01.service;

import com.practica01.model.Arbol;
import com.practica01.repositorio.ArbolRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArbolService {

    @Autowired
    private ArbolRepositorio arbolRepository;

    public List<Arbol> findAll() {
        return arbolRepository.findAll();
    }

    public Optional<Arbol> findById(Integer id) {
        return arbolRepository.findById(id);
    }

    public Arbol save(Arbol arbol) {
        return arbolRepository.save(arbol);
    }

    public void deleteById(Integer id) {
        arbolRepository.deleteById(id);
    }
}
