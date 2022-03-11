package com.aeon.biblioteca.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.aeon.biblioteca.entities.Livro;

import lombok.Data;

@Data
public class LivroGetResponseDTO {

	private String nome;
	
	public static LivroGetResponseDTO convert(Livro liv) {
		LivroGetResponseDTO usuDTO = new LivroGetResponseDTO();
		usuDTO.setNome(liv.getNome());
		return usuDTO;
	}

	public static List<LivroGetResponseDTO> convertList(List<Livro> livList) {
		return livList.stream().map(LivroGetResponseDTO::convert).collect(Collectors.toList());
	}
}
