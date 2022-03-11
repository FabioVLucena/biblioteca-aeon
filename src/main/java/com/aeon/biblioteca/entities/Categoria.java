package com.aeon.biblioteca.entities;

import java.sql.Date;

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
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ctg_id")
	private Integer id;
	
	@Column(name = "ctg_descricao", nullable = false, length = 120, unique = false)
	private String descricao;

	@Column(name = "ctg_tag", nullable = true, length = 100, unique = false)
	private String tag;
	
	@Column(name = "ctg_dataCadastro", nullable = false)
	private Date dataCadastro;
}
