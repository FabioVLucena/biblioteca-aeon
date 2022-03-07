package com.aeon.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeon.biblioteca.entityes.LivroTipo;

public interface LivroTipoRepository extends JpaRepository<LivroTipo, Long> {

}
