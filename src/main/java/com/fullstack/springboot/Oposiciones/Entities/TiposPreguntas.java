package com.fullstack.springboot.Oposiciones.Entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOS_PREGUNTAS")
public class TiposPreguntas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TIPO_PREGUNTA_ID")
	private Integer tipo_pregunta_id;

	@Column(name = "TITULO")
	private String titulo;

	@OneToMany(mappedBy = "tiposPreguntas", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Set<Temarios> temarios;

	/**
	 * 
	 */
	public TiposPreguntas() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the tipo_pregunta_id
	 */
	public Integer getTipo_pregunta_id() {
		return tipo_pregunta_id;
	}

	/**
	 * @param tipo_pregunta_id the tipo_pregunta_id to set
	 */
	public void setTipo_pregunta_id(Integer tipo_pregunta_id) {
		this.tipo_pregunta_id = tipo_pregunta_id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the temarios
	 */
	public Set<Temarios> getTemarios() {
		return temarios;
	}

	/**
	 * @param temarios the temarios to set
	 */
	public void setTemarios(Set<Temarios> temarios) {
		this.temarios = temarios;
	}

}
