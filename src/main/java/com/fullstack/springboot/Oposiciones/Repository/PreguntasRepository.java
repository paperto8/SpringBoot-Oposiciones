package com.fullstack.springboot.Oposiciones.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.springboot.Oposiciones.Entities.Preguntas;

public interface PreguntasRepository extends JpaRepository<Preguntas, Integer>{
	
	void save(Optional<Preguntas> preguntasToUpdate);

}
