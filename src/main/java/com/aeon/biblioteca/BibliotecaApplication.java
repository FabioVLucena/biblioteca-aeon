package com.aeon.biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aeon.biblioteca.entityes.Livro;
import com.aeon.biblioteca.service.LivroService;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(BibliotecaApplication.class, args);
	
		LivroService livDAO = new LivroService();
		
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("05/03/2022");
		
		Livro livro = new Livro();
		livro.setNome("FABIO TITNITM");
		livro.setDataLancamento(data);
		
		livDAO.insert(livro);
	}
}
