package com.aeon.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aeon.biblioteca.entityes.AutorLivro;
import com.aeon.biblioteca.entityes.Livro;
import com.aeon.biblioteca.repositories.AutorLivroRepository;
import com.aeon.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {

	@Autowired
	private LivroRepository livDAO;
	
	@Autowired
	private AutorLivroRepository autLivDAO;
	
	@Transactional(readOnly = true)
	public void insert(Livro liv) {
		livDAO.save(liv);
		System.out.println("livro salvo com sucesso!!");
	}
		
	@Transactional(readOnly = true)
	public List<Livro> getLivros() {
		List<Livro> livList = livDAO.findAll(); 
		return livList;
	}
	
	@Transactional(readOnly = true)
	public List<Livro> getLivrosAutor(Long autId) {
		List<AutorLivro> autLivList = autLivDAO.findByAutor(autId); 
		
		List<Livro> livList = new ArrayList<Livro>();
		
		for(AutorLivro autLivBean : autLivList) {
			livList.add(autLivBean.getLivro());
		}
		
		return livList;
	}
	
}
