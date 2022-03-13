package com.aeon.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aeon.biblioteca.entities.Livro;
import com.aeon.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livroRepo;
	
	@Transactional(readOnly = true)
	public void save(Livro liv) {
		livroRepo.save(liv);
	}
	
	@Transactional(readOnly = true)
	public Livro getById(Long id) {
		Livro livro = livroRepo.getById(id);
		return livro;
	}
	
	@Transactional(readOnly = true)
	public List<Livro> findAll() {
		List<Livro> livList = livroRepo.findAll(); 
		return livList;
	}
}
