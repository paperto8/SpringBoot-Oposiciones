package com.fullstack.springboot.Oposiciones.Controllers;

import java.util.List;
import java.util.Optional;

import com.fullstack.springboot.Oposiciones.Entities.Preguntas;

public interface PreguntasController {

	public List<Preguntas> getPreguntas();

	public Optional<Preguntas> getPreguntasById(Integer id);

	public Preguntas addPreguntas(Preguntas Preguntas);

	public String deletePreguntas(Integer id);

	public String updatePreguntas(Preguntas PreguntasNew);

	public String test();
}
