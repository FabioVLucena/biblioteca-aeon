package com.aeon.biblioteca.dto;

import java.time.LocalDate;

import com.aeon.biblioteca.entities.Autor;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class AutorPostRequestDTO {

	private String nome;
	private String nomeFantasia;
	
	@JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
	private LocalDate dataNascimento;
	
	public static Autor convert(AutorPostRequestDTO dto) {
		return convert(new Autor(), dto);
	}

	private static Autor convert(Autor ent, AutorPostRequestDTO dto) {
		ent.setNome(dto.getNome());
		ent.setNomeFantasia(dto.getNomeFantasia());
		ent.setDataNascimento(dto.getDataNascimento());
		
		return ent;
	}
}
