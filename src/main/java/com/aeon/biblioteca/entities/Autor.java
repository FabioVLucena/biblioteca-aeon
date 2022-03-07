package com.aeon.biblioteca.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "autor")
@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aut_id")
	private Long id;
	
	@Column(name = "aut_cpf", nullable = false, length = 14, unique = true)
	private String cpf;
	
	@Column(name = "aut_nome", nullable = true, length = 120, unique = false)
	private String nome;
	
	@Column(name = "aut_nomeFantasia", nullable = true, length = 120, unique = false)
	private String nomeFantasia;
	
	@Column(name = "aut_dataNascimento", nullable = true)
	private Date dataNascimento;
}
