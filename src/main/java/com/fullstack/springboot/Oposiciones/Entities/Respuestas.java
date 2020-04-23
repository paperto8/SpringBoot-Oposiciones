package com.fullstack.springboot.Oposiciones.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESPUESTAS")
public class Respuestas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESPUESTA_ID")
	private Integer respuesta_id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PREGUNTA_ID", referencedColumnName = "PREGUNTA_ID")
	private Preguntas pregunta_id;

	@Column(name = "TITULO")
	private Integer titulo;

	@Column(name = "CORRECTA")
	private Boolean correcta;

	@Column(name = "EXPLICACION_CORRECTA")
	private String explicacionCorrecta;

	/**
	 * 
	 */
	public Respuestas() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correcta == null) ? 0 : correcta.hashCode());
		result = prime * result + ((explicacionCorrecta == null) ? 0 : explicacionCorrecta.hashCode());
		result = prime * result + ((pregunta_id == null) ? 0 : pregunta_id.hashCode());
		result = prime * result + ((respuesta_id == null) ? 0 : respuesta_id.hashCode());
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
		Respuestas other = (Respuestas) obj;
		if (correcta == null) {
			if (other.correcta != null)
				return false;
		} else if (!correcta.equals(other.correcta))
			return false;
		if (explicacionCorrecta == null) {
			if (other.explicacionCorrecta != null)
				return false;
		} else if (!explicacionCorrecta.equals(other.explicacionCorrecta))
			return false;
		if (pregunta_id == null) {
			if (other.pregunta_id != null)
				return false;
		} else if (!pregunta_id.equals(other.pregunta_id))
			return false;
		if (respuesta_id == null) {
			if (other.respuesta_id != null)
				return false;
		} else if (!respuesta_id.equals(other.respuesta_id))
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
		return "Respuestas [respuesta_id=" + respuesta_id + ", pregunta_id=" + pregunta_id + ", titulo=" + titulo
				+ ", correcta=" + correcta + ", explicacionCorrecta=" + explicacionCorrecta + "]";
	}

	/**
	 * @return the respuesta_id
	 */
	public Integer getRespuesta_id() {
		return respuesta_id;
	}

	/**
	 * @param respuesta_id the respuesta_id to set
	 */
	public void setRespuesta_id(Integer respuesta_id) {
		this.respuesta_id = respuesta_id;
	}

	/**
	 * @return the pregunta_id
	 */
	public Preguntas getPregunta_id() {
		return pregunta_id;
	}

	/**
	 * @param pregunta_id the pregunta_id to set
	 */
	public void setPregunta_id(Preguntas pregunta_id) {
		this.pregunta_id = pregunta_id;
	}

	/**
	 * @return the titulo
	 */
	public Integer getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(Integer titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the correcta
	 */
	public Boolean getCorrecta() {
		return correcta;
	}

	/**
	 * @param correcta the correcta to set
	 */
	public void setCorrecta(Boolean correcta) {
		this.correcta = correcta;
	}

	/**
	 * @return the explicacionCorrecta
	 */
	public String getExplicacionCorrecta() {
		return explicacionCorrecta;
	}

	/**
	 * @param explicacionCorrecta the explicacionCorrecta to set
	 */
	public void setExplicacionCorrecta(String explicacionCorrecta) {
		this.explicacionCorrecta = explicacionCorrecta;
	}

}
