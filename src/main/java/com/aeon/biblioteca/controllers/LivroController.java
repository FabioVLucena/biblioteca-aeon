package com.aeon.biblioteca.controllers;

import java.text.ParseException;
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
import com.aeon.biblioteca.service.LivroService;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public ResponseEntity<List<LivroGetResponseDTO>> list() {
		List<Livro> usuList = livroService.findAll();
		List<LivroGetResponseDTO> resList = LivroGetResponseDTO.convertList(usuList);
		return ResponseEntity.ok(resList);
	}
	
	@PostMapping
	public ResponseEntity<LivroGetResponseDTO> create(@RequestBody LivroPostRequestDTO livDTO) throws ParseException {
		Livro liv = LivroPostRequestDTO.convert(livDTO);
		
		livroService.save(liv);
		
		return ResponseEntity.ok(LivroGetResponseDTO.convert(liv));
	}
}
