package com.aeon.biblioteca.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "editora")
public class Editora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "edit_id")
	private Integer id;
	
	@Column(name = "edit_nome", nullable = false, length = 120, unique = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "sit_id", foreignKey = @ForeignKey(name = "fk_editora_situacao"))
	private Situacao situacao;

	@Column(name = "edit_dataCadastro", nullable = true)
	private Date dataCadastro;
	
	@Column(name = "edit_dataAbertura", nullable = false)
	private Date dataAbertura;
}
