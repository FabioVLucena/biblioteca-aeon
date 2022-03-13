package com.aeon.biblioteca.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aeon.biblioteca.entities.AutorLivro;
import com.aeon.biblioteca.repositories.AutorLivroRepository;

@Service
public class AutorLivroService {

	@Autowired
	AutorLivroRepository autorLivroRepo;
	
	@Transactional(readOnly = true)
	public void save(AutorLivro autorLivro) {
		autorLivroRepo.save(autorLivro);
	}
	
	@Transactional(readOnly = true)
	public AutorLivro getById(Long id) {
		AutorLivro autorLivro = autorLivroRepo.getById(id);
		return autorLivro;
	}
	
	@Transactional(readOnly = true)
	public List<AutorLivro> findAll(){
		List<AutorLivro> autorLivroList = autorLivroRepo.findAll();
		return autorLivroList;
	}
	
	@Transactional(readOnly = true)
	public List<AutorLivro> findByAutor(Long id){
		List<AutorLivro> autorLivroList = autorLivroRepo.findByAutor(id);
		return autorLivroList;
	}
	
	@Transactional(readOnly = true)
	public List<AutorLivro> findByLivro(Long id){
		List<AutorLivro> autorLivroList = autorLivroRepo.findByLivro(id);
		return autorLivroList;
	}
}
