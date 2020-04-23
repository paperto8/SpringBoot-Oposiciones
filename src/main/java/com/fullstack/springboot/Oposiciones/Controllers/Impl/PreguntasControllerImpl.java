package com.fullstack.springboot.Oposiciones.Controllers.Impl;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.springboot.Oposiciones.Controllers.PreguntasController;
import com.fullstack.springboot.Oposiciones.Entities.Preguntas;
import com.fullstack.springboot.Oposiciones.Service.PreguntasService;

@RestController
public class PreguntasControllerImpl implements PreguntasController {
	@Autowired
	PreguntasService preguntasService;

	private static final Logger LOGGER = LogManager.getLogger(PreguntasControllerImpl.class);

	// http://localhost:8888/Preguntass (GET)
	@RequestMapping(value = "/Preguntas1", method = RequestMethod.GET, produces = "application/json")
	@Override
	public List<Preguntas> getPreguntas() {
		LOGGER.debug("IN [PreguntasControllerImpl] - getPreguntas()");
		return preguntasService.findAllPreguntas();
	}

	// http://localhost:8888/Preguntass/1 (GET)
	@Override
	@RequestMapping(value = "/Preguntas/{id}", method = RequestMethod.GET, produces = "application/json")
	public Optional<Preguntas> getPreguntasById(@PathVariable Integer id) {
		LOGGER.debug("IN [PreguntasControllerImpl] - getPreguntasById(id) id=" + id);
		return preguntasService.findPreguntasById(id);
	}

	// http://localhost:8888/Preguntass/add (ADD)
	@Override
	@RequestMapping(value = "/Preguntas/add", method = RequestMethod.POST, produces = "application/json")
	public Preguntas addPreguntas(Preguntas Preguntas) {
		LOGGER.debug("IN [PreguntasControllerImpl] - addPreguntas(preguntas) preguntas=" + Preguntas);
		return preguntasService.savePreguntas(Preguntas);
	}

	// http://localhost:8888/Preguntass/delete/1 (GET)
	@Override
	@RequestMapping(value = "/Preguntas/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public String deletePreguntas(@PathVariable Integer id) {
		LOGGER.debug("IN [PreguntasControllerImpl] - getPreguntasById(id) id=" + id);
		return preguntasService.deletePreguntas(id);
	}

	// http://localhost:8888/Preguntass/update (PATCH)
	@Override
	@RequestMapping(value = "/Preguntas/update", method = RequestMethod.PATCH, produces = "application/json")
	public String updatePreguntas(Preguntas PreguntasNew) {
		LOGGER.debug("IN [PreguntasControllerImpl] - updatePreguntas(PreguntasNew) PreguntasNew=" + PreguntasNew);
		return preguntasService.updatePreguntas(PreguntasNew);
	}

	// http://localhost:8888/test (GET)
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
	@Override
	public String test() {
		return "Test done";
	}
}
