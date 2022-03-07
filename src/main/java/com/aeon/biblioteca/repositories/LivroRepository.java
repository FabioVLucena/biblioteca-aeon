package com.aeon.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeon.biblioteca.entityes.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
}
