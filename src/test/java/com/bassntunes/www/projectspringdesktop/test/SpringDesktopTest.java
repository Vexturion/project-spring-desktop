/**
 * 
 */
package com.bassntunes.www.projectspringdesktop.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bassntunes.www.project_spring_desktop.dao.DisqueraDAO;

/**
 * @author Horiz clase de prueba unitaria que permite realizar pruebas con el
 *         framework spring
 */
class SpringDesktopTest {

	@Test
	void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);

		DisqueraDAO disqueraDAO = (DisqueraDAO) context.getBean("disqueraDAObean");

		assertNotNull(disqueraDAO);
		
		DisqueraDAO  disqueraDAOnuevo = (DisqueraDAO) context.getBean("disqueraDAObean");
		
		System.out.println("Contexto cargado exitosamente");
		
		System.out.println(disqueraDAO);
		
		System.out.println(disqueraDAOnuevo);
		
		// :::::::::::::: properties :::::::::::::
		
		Properties properties = (Properties) context.getBean("properties");
		
		System.out.println(properties.get("spring-username"));
	}

}
