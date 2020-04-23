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
@Table(name = "TEMARIOS")
public class Temarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEMARIO_ID")
	private Integer temario_id;

	@Column(name = "TITULO")
	private String titulo;

	@OneToMany(mappedBy = "temarios", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Set<Preguntas> preguntas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_PREGUNTA_ID", referencedColumnName = "TIPO_PREGUNTA_ID", insertable = false, updatable = false)
	private TiposPreguntas tiposPreguntas;

	/**
	 * 
	 */
	public Temarios() {
		super();
	}

	/**
	 * @return the temario_id
	 */
	public Integer getTemario_id() {
		return temario_id;
	}

	/**
	 * @param temario_id the temario_id to set
	 */
	public void setTemario_id(Integer temario_id) {
		this.temario_id = temario_id;
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
	 * @return the preguntas
	 */
	public Set<Preguntas> getPreguntas() {
		return preguntas;
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(Set<Preguntas> preguntas) {
		this.preguntas = preguntas;
	}

	/**
	 * @return the tiposPreguntas
	 */
	public TiposPreguntas getTiposPreguntas() {
		return tiposPreguntas;
	}

	/**
	 * @param tiposPreguntas the tiposPreguntas to set
	 */
	public void setTiposPreguntas(TiposPreguntas tiposPreguntas) {
		this.tiposPreguntas = tiposPreguntas;
	}

}
