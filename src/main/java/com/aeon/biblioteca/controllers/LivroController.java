package com.aeon.biblioteca.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeon.biblioteca.dto.LivroGetResponseDTO;
import com.aeon.biblioteca.dto.LivroPostRequestDTO;
import com.aeon.biblioteca.entities.Livro;
import com.aeon.biblioteca.repositories.LivroRepository;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	@Autowired
	private LivroRepository livRepo;
	
	@GetMapping
	public ResponseEntity<List<LivroGetResponseDTO>> list() {
		List<Livro> usuList = livRepo.findAll();
		List<LivroGetResponseDTO> resList = LivroGetResponseDTO.convertList(usuList);
		return ResponseEntity.ok(resList);
	}
	
	@PostMapping
	public ResponseEntity<LivroGetResponseDTO> create(@RequestBody LivroPostRequestDTO livDTO) throws ParseException {
		Livro liv = LivroPostRequestDTO.convert(livDTO);
//		liv.setNome("FABIO TITNITM");
		
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("05/03/2022");
		liv.setDataLancamento(data);
		
		livRepo.save(liv);
		
		return ResponseEntity.ok(LivroGetResponseDTO.convert(liv));
	}
}