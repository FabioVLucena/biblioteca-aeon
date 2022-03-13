package com.aeon.biblioteca.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.aeon.biblioteca.entities.Autor;

import lombok.Data;

@Data
public class AutorGetResponseDTO {

	private String nome;
	private String nomeFantasia;
	private LocalDate dataNascimento;
	
	public static AutorGetResponseDTO convert(Autor aut) {
		AutorGetResponseDTO autorDTO = new AutorGetResponseDTO();
		autorDTO.setNome(aut.getNome());
		autorDTO.setNomeFantasia(aut.getNomeFantasia());
		autorDTO.setDataNascimento(aut.getDataNascimento());
		
		return autorDTO;
	}
	
	public static List<AutorGetResponseDTO> convertList(List<Autor> autList){
		return autList.stream().map(AutorGetResponseDTO::convert).collect(Collectors.toList());
	}
}
