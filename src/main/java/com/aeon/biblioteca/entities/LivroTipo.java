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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "livrotipo")
public class LivroTipo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "livT_id")
	private Integer id;
	
	@Column(name = "livT_descricao", nullable = false, length = 120, unique = false)
	private String descricao;
	
	@Column(name = "livT_dataCadastro")
	private Date dataCadastro;
}
