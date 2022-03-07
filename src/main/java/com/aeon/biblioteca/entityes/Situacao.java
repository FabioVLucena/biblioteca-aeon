package com.aeon.biblioteca.entityes;

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
@Table(name = "situacao")
public class Situacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sit_id")
	private Integer id;
	
	@Column(name = "sit_descricao", nullable = false, length = 120, unique = false)
	private String descricao;
	
	@Column(name = "sit_tag", nullable = true, length = 100, unique = false)
	private String tag;
	
	@Column(name = "sit_dataCadastro", nullable = false)
	private Date dataCadastro;
}
