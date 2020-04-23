package com.fullstack.springboot.Oposiciones.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPOS_PREGUNTAS")
public class TiposPreguntas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TIPO_PREGUNTA_ID")
	private Integer pregunta_id;

	@Column(name = "TITULO")
	private String titulo;

	public TiposPreguntas() {
		super();
	}

	/**
	 * @param pregunta_id
	 * @param titulo
	 */
	public TiposPreguntas(Integer pregunta_id, String titulo) {
		super();
		this.pregunta_id = pregunta_id;
		this.titulo = titulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pregunta_id == null) ? 0 : pregunta_id.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TiposPreguntas other = (TiposPreguntas) obj;
		if (pregunta_id == null) {
			if (other.pregunta_id != null)
				return false;
		} else if (!pregunta_id.equals(other.pregunta_id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TiposPreguntas [pregunta_id=" + pregunta_id + ", titulo=" + titulo + "]";
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

}
