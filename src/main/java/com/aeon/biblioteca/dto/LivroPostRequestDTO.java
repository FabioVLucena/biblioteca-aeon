package com.aeon.biblioteca.dto;

import com.aeon.biblioteca.entities.Livro;

import lombok.Data;

@Data
public class LivroPostRequestDTO {
	
	private String nome;
	
	public static Livro convert(LivroPostRequestDTO dto) {
		return convert(new Livro(), dto);
	}
	public static Livro convert(Livro ent, LivroPostRequestDTO dto) {

		ent.setNome(dto.getNome());
		
		return ent;
	}
}