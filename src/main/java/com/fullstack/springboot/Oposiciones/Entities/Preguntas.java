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
@Table(name = "PREGUNTAS")
public class Preguntas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PREGUNTA_ID")
	private Integer pregunta_id;

	@Column(name = "TITULO")
	private String titulo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEMARIO_ID", referencedColumnName = "TEMARIO_ID", insertable = false, updatable = false)
	private Temarios temarios;

	@OneToMany(mappedBy = "preguntas", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Set<Respuestas> respuestas;

	public Preguntas() {
		super();
	}

	/**
	 * @return the pregunta_id
	 */
	public Integer getPregunta_id() {
		return pregunta_id;
	}

	/**
	 * @param pregunta_id the pregunta_id to set
	 */
	public void setPregunta_id(Integer pregunta_id) {
		this.pregunta_id = pregunta_id;
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
	public Temarios getTemarios() {
		return temarios;
	}

	/**
	 * @param temarios the temarios to set
	 */
	public void setTemarios(Temarios temarios) {
		this.temarios = temarios;
	}

	/**
	 * @return the respuestas
	 */
	public Set<Respuestas> getRespuestas() {
		return respuestas;
	}

	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(Set<Respuestas> respuestas) {
		this.respuestas = respuestas;
	}

}
