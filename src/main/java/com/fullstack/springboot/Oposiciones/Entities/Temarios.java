package com.fullstack.springboot.Oposiciones.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEMARIOS")
public class Temarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEMARIO_ID")
	private Integer temario_id;

	@Column(name = "TITULO")
	private String titulo;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PREGUNTA_ID", referencedColumnName = "PREGUNTA_ID")
	@Column(name = "TIPO_PREGUNTA_ID")
	private Integer tipo_pregunta_id;
}
