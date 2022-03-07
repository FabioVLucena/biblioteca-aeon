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
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "liv_id")
	private Long id;
	
	@Column(name = "liv_nome", nullable = false, length = 120, unique = false)
	private String nome;

	@Column(name = "liv_dataLancamento", nullable = false)
	private Date dataLancamento;

	@ManyToOne
	@JoinColumn(name = "edit_id", foreignKey = @ForeignKey(name = "fk_livro_editora"))
	private Editora editora;
	
	@ManyToOne
	@JoinColumn(name = "sit_id", foreignKey = @ForeignKey(name = "fk_livro_situacao"))
	private Situacao situacao;
	
	@ManyToOne
	@JoinColumn(name = "livT_id", foreignKey = @ForeignKey(name = "fk_livro_livroTipo"))
	private LivroTipo livroTipo;
}
