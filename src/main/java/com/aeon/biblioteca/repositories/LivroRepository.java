package com.aeon.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aeon.biblioteca.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}
