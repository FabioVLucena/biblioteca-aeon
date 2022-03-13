package com.aeon.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aeon.biblioteca.dto.AutorGetResponseDTO;
import com.aeon.biblioteca.dto.AutorPostRequestDTO;
import com.aeon.biblioteca.entities.Autor;
import com.aeon.biblioteca.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {

	@Autowired
	private AutorService autorService;
	
	@GetMapping
	public ResponseEntity<List<AutorGetResponseDTO>> list(){
		List<Autor> autList = autorService.findAll();
		List<AutorGetResponseDTO> resList = AutorGetResponseDTO.convertList(autList);
		return ResponseEntity.ok(resList);
	}
	
	@PostMapping
	public ResponseEntity<AutorGetResponseDTO> create(@RequestBody AutorPostRequestDTO autDTO){
		Autor autor = AutorPostRequestDTO.convert(autDTO);
		
		autorService.save(autor);
		
		return ResponseEntity.ok(AutorGetResponseDTO.convert(autor));
	}
}
