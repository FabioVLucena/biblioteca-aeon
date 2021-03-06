package com.aeon.biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeon.biblioteca.entities.AutorLivro;

@Repository
public interface AutorLivroRepository extends JpaRepository<AutorLivro, Long>{
	List<AutorLivro> findByAutor(Long autId);
	List<AutorLivro> findByLivro(Long livId);
}
