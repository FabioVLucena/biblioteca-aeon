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
@Table(name = "livrocategoria")
public class LivroCategoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "livCtg_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "liv_id", foreignKey = @ForeignKey(name = "fk_livroCategoria_livro"))
	private Livro livro;

	@ManyToOne
	@JoinColumn(name = "ctg_id", foreignKey = @ForeignKey(name = "fk_livroCategoria_categoria"))
	private Categoria categoria;
	
	@Column(name = "livCtg_dataVinculo", nullable = false)
	private Date dataVinculo;
}
