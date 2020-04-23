/**
 * 
 */
package com.fullstack.springboot.Oposiciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.init.ScriptException;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.test.context.junit4.SpringRunner;

import com.fullstack.springboot.Oposiciones.Controllers.Impl.PreguntasControllerImpl;
import com.fullstack.springboot.Oposiciones.Entities.TiposPreguntas;
import com.fullstack.springboot.Oposiciones.Service.TiposPreguntasService;

/**
 * @author jafuentes
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TiposPreguntasServiceImplTest {
	
	private static final Logger LOGGER = LogManager.getLogger(TiposPreguntasServiceImplTest.class);

	@Autowired
	private TiposPreguntasService tiposPreguntasService;	
	@Autowired
	private JdbcTemplate jdbc;

	private static final String CREATE_TIPOS_PREGUNTAS_SQL_SCRIPT = "scripts/create/tipos_preguntas.sql";
	private static final String DROP_TIPOS_PREGUNTAS_SQL_SCRIPT = "scripts/drop/tipos_preguntas.sql";

	@Before
	public void before() throws ScriptException, SQLException {
		ScriptUtils.executeSqlScript(jdbc.getDataSource().getConnection(),
				new ClassPathResource(CREATE_TIPOS_PREGUNTAS_SQL_SCRIPT));
	}

	@After
	public void after() throws ScriptException, SQLException {
		ScriptUtils.executeSqlScript(jdbc.getDataSource().getConnection(),
				new ClassPathResource(DROP_TIPOS_PREGUNTAS_SQL_SCRIPT));
	}

	@Test
	public void tiposPreguntasServiceFillAllTest() {
		LOGGER.debug("IN [TiposPreguntasServiceImplTest] - tiposPreguntasServiceFillAllTest()");
		List<TiposPreguntas> list = tiposPreguntasService.findAllTiposPreguntas();
		LOGGER.debug("Tamañño-> "+list.size());
		assertEquals(2, list.size());
	}
}
