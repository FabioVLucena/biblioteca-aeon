package com.aeon.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeon.biblioteca.entities.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
