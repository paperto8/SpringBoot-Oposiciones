package com.fullstack.springboot.Oposiciones.Service;

import java.util.List;
import java.util.Optional;

import com.fullstack.springboot.Oposiciones.Entities.Preguntas;

public interface PreguntasService {
	public List<Preguntas> findAllPreguntas();

	public Optional<Preguntas> findPreguntasById(Integer id);

	public Preguntas savePreguntas(Preguntas PreguntasNew);

	public String deletePreguntas(Integer id);

	public String updatePreguntas(Preguntas PreguntasNew);
}
