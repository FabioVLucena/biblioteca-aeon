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
@Table(name = "autorlivro")
public class AutorLivro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "autLv_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "liv_id",  foreignKey = @ForeignKey(name = "fk_autorLivro_livro"))
	private Livro livro;
	
	@ManyToOne
	@JoinColumn(name = "aut_id", foreignKey = @ForeignKey(name = "fk_autorLivro_autor"))
	private Autor autor;
	
	@Column(name = "autLv_dataVinculo", nullable = false)
	private Date dataVinculo;
}
