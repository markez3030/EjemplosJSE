package com.ipartek.formacion.ejecicioReceta.pojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class IngredienteTest {

	@Test
	public void cantidadNegativaIngrediente() {
		Ingrediente i = new Ingrediente("Gindilla Cayena", -1 ,false);
		assertEquals(0, i.getCantidad());
	}

}
