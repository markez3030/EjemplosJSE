package com.ipartek.formacion.ejecicioOrdenacionBurbuja.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.ejecicioDado.pojo.Utilidades;

public class bubbleSort {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void bubbleSort() {
		// TODO Auto-generated constructor stub
		int[] aDesordenados = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] ordenados = Utilidades.bubbleSort(aDesordenados);

		assertEquals(0, ordenados[0]);
		assertEquals(1, ordenados[1]);
		assertEquals(2, ordenados[2]);
		assertEquals(3, ordenados[3]);
		assertEquals(4, ordenados[4]);
		assertEquals(5, ordenados[5]);
		assertEquals(6, ordenados[6]);
		assertEquals(7, ordenados[7]);
		assertEquals(8, ordenados[8]);
		assertEquals(9, ordenados[9]);

		int[] ordenados2 = Utilidades.bubbleSortMetodo2(aDesordenados);

		assertEquals(0, ordenados2[0]);
		assertEquals(1, ordenados2[1]);
		assertEquals(2, ordenados2[2]);
		assertEquals(3, ordenados2[3]);
		assertEquals(4, ordenados2[4]);
		assertEquals(5, ordenados2[5]);
		assertEquals(6, ordenados2[6]);
		assertEquals(7, ordenados2[7]);
		assertEquals(8, ordenados2[8]);
		assertEquals(9, ordenados2[9]);

	}

}
