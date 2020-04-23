/**
 * 
 */
package com.fullstack.springboot.Oposiciones.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.springboot.Oposiciones.Entities.TiposPreguntas;
import com.fullstack.springboot.Oposiciones.Repository.TiposPreguntasRepository;
import com.fullstack.springboot.Oposiciones.Service.TiposPreguntasService;

/**
 * @author jafuentes
 *
 */
@Service
public class TiposPreguntasServiceImpl implements TiposPreguntasService{
	
	@Autowired
	TiposPreguntasRepository tiposPreguntasRepository;

	@Override
	public List<TiposPreguntas> findAllTiposPreguntas() {
		return tiposPreguntasRepository.findAll();
	}

}
