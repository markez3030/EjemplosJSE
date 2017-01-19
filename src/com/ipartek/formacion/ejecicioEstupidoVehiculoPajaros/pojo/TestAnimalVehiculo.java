package com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.pojo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz.ComparatorEstupido;
import com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz.InterfazEstupido;

public class TestAnimalVehiculo {

	private ArrayList<InterfazEstupido> lr = null;
	private Vehiculo v1 = null;
	private Vehiculo v2 = null;
	private Pajaro p1 = null;
	private Pajaro p2 = null;

	/**
	 * Metodo que se ejecuta antes del test
	 * 
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * * Metodo que se ejecuta despues del test
	 * 
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Metodo que se ejecuta antes de cada ejecucion de cada metodo del test
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		lr = new ArrayList<InterfazEstupido>();
		v1 = new Vehiculo("Seat");
		p1 = new Pajaro("Kiwi");
		v2 = new Vehiculo("Ford K");
		p2 = new Pajaro("Gallina");
		v1.setPotencia(500);
		v2.setPotencia(100);
		p1.setHuevosSemana(2);
		p2.setHuevosSemana(700);
		lr.add(v1);
		lr.add(v2);
		lr.add(p1);
		lr.add(p2);

	}

	/**
	 * Metodo que se ejecuta despues de cada ejecucion de cada metodo del test
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		lr = null;
		v1 = null;
		p1 = null;
		v2 = null;
		p2 = null;

	}

	@Test
	public void ordenarPorPeso() {

		Collections.sort(lr, new ComparatorEstupido());
		assertEquals(p1, lr.get(0));
		assertEquals(v2, lr.get(1));
		assertEquals(v1, lr.get(2));
		assertEquals(p2, lr.get(3));
	}

}
