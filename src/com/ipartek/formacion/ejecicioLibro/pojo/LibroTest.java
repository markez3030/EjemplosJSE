package com.ipartek.formacion.ejecicioLibro.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testTitulo() {
		Libro l =new Libro();
		l.setNombre("JAVA SE7");
		assertEquals("JAVA SE7", l.getNombre());
	}
	
	
	@Test
	public void testNumeroPaginas() {
		Libro l =new Libro();
		l.setNumeroPaginas(300);
		assertEquals(300, l.getNumeroPaginas());
		l.setNumeroPaginas(-33);
		assertEquals(0, l.getNumeroPaginas());
	}
	
	
	@Test
	public void constructorPorDefecto()
	{
		Libro l= new Libro(-1,"JAVA SE7","anonimo");
		assertEquals("JAVA SE7", l.getNombre());
		assertEquals("anonimo", l.getAutor());
		assertEquals(0, l.getNumeroPaginas());

	}

}
