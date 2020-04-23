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
	@JoinColumn(name = "PREGUNTA_ID" , referencedColumnName = "PREGUNTA_ID", insertable = false, updatable = false)
	private Preguntas preguntas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIPO_PREGUNTA_ID", referencedColumnName = "TIPO_PREGUNTA_ID", insertable = false, updatable = false)
	private TiposPreguntas tiposPreguntas;

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
	 * @return the preguntas
	 */
	public Preguntas getPreguntas() {
		return preguntas;
	}

	/**
	 * @param preguntas the preguntas to set
	 */
	public void setPreguntas(Preguntas preguntas) {
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
