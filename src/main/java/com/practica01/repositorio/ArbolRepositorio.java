package com.practica01.repositorio;

import com.practica01.model.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArbolRepositorio extends JpaRepository<Arbol, Integer> {
}
