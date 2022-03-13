package com.aeon.biblioteca.dto;

import java.time.LocalDateTime;

import com.aeon.biblioteca.entities.Livro;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class LivroPostRequestDTO {
	
	private String nome;
	
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", shape = JsonFormat.Shape.STRING)
	private LocalDateTime dataLancamento;
	
	public static Livro convert(LivroPostRequestDTO dto) {
		return convert(new Livro(), dto);
	}
	
	public static Livro convert(Livro ent, LivroPostRequestDTO dto) {
		ent.setNome(dto.getNome());
		ent.setDataLancamento(dto.getDataLancamento());
		
		return ent;
	}
}