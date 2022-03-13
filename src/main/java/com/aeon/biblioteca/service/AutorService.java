package com.aeon.biblioteca.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aeon.biblioteca.entities.Autor;
import com.aeon.biblioteca.repositories.AutorRepository;

@Service
public class AutorService {

	@Autowired
	private AutorRepository autorRepo;

	@Transactional(readOnly = true)
	public void save(Autor autor) {
		autorRepo.save(autor);
	}
	
	@Transactional(readOnly = true)
	public Autor getById(Long id) {
		Autor autor = autorRepo.getById(id);
		return autor;
	}
	
	@Transactional(readOnly = true)
	public List<Autor> findAll(){
		List<Autor> autorList = autorRepo.findAll();
		return autorList;
	}
	
}
