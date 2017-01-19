package com.ipartek.formacion.ejecicioDado.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.ipartek.formacion.ejecicioReceta.pojo.Receta;

public class UtilidadesTest {


	@Test
	public void testGetnumeroAleatorio() {

		int numero;
		final int NUMERO_MAXIMO = 10;

		boolean[] aAlumnosBool = new boolean[NUMERO_MAXIMO];
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getnumeroAleatorio(NUMERO_MAXIMO);
			assertTrue(numero >= 0 && numero <= NUMERO_MAXIMO);
			aAlumnosBool[numero] = true;
		}

		for (boolean b : aAlumnosBool) {
			assertTrue(b);
		}
	}

	@Test
	public void testSumaTonta() {
		int num1 = 0;
		int num2 = 0;
		assertTrue(num1 >= 0 && num2 >= 0);
		int suma = Utilidades.sumaTonta(num1, num2);
		assertTrue(suma < 100);

	}

	@Test
	public void noFallaNunca() {
		assertTrue(true);
	}



}
