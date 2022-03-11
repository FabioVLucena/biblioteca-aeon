package com.aeon.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeon.biblioteca.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
