/**
 * 
 */
package com.fullstack.springboot.Oposiciones.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.springboot.Oposiciones.Entities.TiposPreguntas;

/**
 * @author jafuentes
 *
 */
public interface TiposPreguntasRepository extends JpaRepository<TiposPreguntas, Integer> {

	void save(Optional<TiposPreguntas> tiposPreguntasToUpdate);

}
