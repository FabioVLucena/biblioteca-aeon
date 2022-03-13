package com.aeon.biblioteca.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.aeon.biblioteca.entities.Livro;

import lombok.Data;

@Data
public class LivroGetResponseDTO {

	private String nome;
	private LocalDateTime dataLancamento;
	
	public static LivroGetResponseDTO convert(Livro liv) {
		LivroGetResponseDTO livroDTO = new LivroGetResponseDTO();
		livroDTO.setNome(liv.getNome());
		livroDTO.setDataLancamento(liv.getDataLancamento());
		return livroDTO;
	}

	public static List<LivroGetResponseDTO> convertList(List<Livro> livList) {
		return livList.stream().map(LivroGetResponseDTO::convert).collect(Collectors.toList());
	}
}
