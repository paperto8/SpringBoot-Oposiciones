package com.fullstack.springboot.Oposiciones.Entities;

public class Respuestas {

	private Long id;

	private String respuesta;

	public Respuestas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Respuestas(Long id, String respuesta) {
		super();
		this.id = id;
		this.respuesta = respuesta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (respuesta == null) {
			if (other.respuesta != null)
				return false;
		} else if (!respuesta.equals(other.respuesta))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
