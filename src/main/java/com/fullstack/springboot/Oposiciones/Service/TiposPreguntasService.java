/**
 * 
 */
package com.fullstack.springboot.Oposiciones.Service;

import java.util.List;

import com.fullstack.springboot.Oposiciones.Entities.TiposPreguntas;

/**
 * @author jafuentes
 *
 */
public interface TiposPreguntasService {

	public List<TiposPreguntas> findAllTiposPreguntas();

}
