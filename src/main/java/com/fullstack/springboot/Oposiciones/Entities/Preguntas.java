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

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "PREGUNTA_ID", referencedColumnName = "PREGUNTA_ID")
	@Column(name = "TEMARIO_ID")
	private Integer temario_id;

	@OneToMany(mappedBy = "pregunta_id", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private Set<Respuestas> books;

	public Preguntas() {
		super();
	}

	public Preguntas(Integer pregunta_id, String titulo) {
		super();
		this.pregunta_id = pregunta_id;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Preguntas [pregunta_id=" + pregunta_id + ", titulo=" + titulo + ", temario_id=" + temario_id + "]";
	}

	public Integer getPregunta_id() {
		return pregunta_id;
	}

	public void setPregunta_id(Integer pregunta_id) {
		this.pregunta_id = pregunta_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getTemario_id() {
		return temario_id;
	}

	public void setTemario_id(Integer temario_id) {
		this.temario_id = temario_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pregunta_id == null) ? 0 : pregunta_id.hashCode());
		result = prime * result + ((temario_id == null) ? 0 : temario_id.hashCode());
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
		Preguntas other = (Preguntas) obj;
		if (pregunta_id == null) {
			if (other.pregunta_id != null)
				return false;
		} else if (!pregunta_id.equals(other.pregunta_id))
			return false;
		if (temario_id == null) {
			if (other.temario_id != null)
				return false;
		} else if (!temario_id.equals(other.temario_id))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
