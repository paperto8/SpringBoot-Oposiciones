package com.fullstack.springboot.Oposiciones.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.springboot.Oposiciones.Entities.Preguntas;
import com.fullstack.springboot.Oposiciones.Repository.PreguntasRepository;
import com.fullstack.springboot.Oposiciones.Service.PreguntasService;
/**
 * @author jafuentes
 *
 */
@Service
public class PreguntasServiceImpl implements PreguntasService {

	@Autowired
	PreguntasRepository preguntasRepository;

	@Override
	public List<Preguntas> findAllPreguntas() {
		return preguntasRepository.findAll();
	}

	@Override
	public Optional<Preguntas> findPreguntasById(Integer id) {
		Optional<Preguntas> Preguntas = preguntasRepository.findById(id);
		return Preguntas;
	}

	@Override
	public Preguntas savePreguntas(Preguntas PreguntasNew) {
		if (PreguntasNew != null) {
			return preguntasRepository.save(PreguntasNew);
		}
		return new Preguntas();
	}

	@Override
	public String deletePreguntas(Integer id) {
		if (preguntasRepository.findById(id).isPresent()) {
			preguntasRepository.deleteById(id);
			return "Preguntas eliminado correctamente.";
		}
		return "Error! El Preguntas no existe";
	}

	@Override
	public String updatePreguntas(Preguntas PreguntasUpdated) {
		Integer num = PreguntasUpdated.getPregunta_id();
		if (preguntasRepository.findById(num).isPresent()) {
			Preguntas PreguntasToUpdate = new Preguntas();
			PreguntasToUpdate.setPregunta_id(PreguntasUpdated.getPregunta_id());
			PreguntasToUpdate.setTitulo(PreguntasUpdated.getTitulo());
			preguntasRepository.save(PreguntasToUpdate);
			return "Preguntas modificado";
		}
		return "Error al modificar el Preguntas";
	}
}