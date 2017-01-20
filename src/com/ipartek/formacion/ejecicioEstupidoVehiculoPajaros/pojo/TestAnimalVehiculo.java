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
import com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz.InterfazEstupida;

public class TestAnimalVehiculo {

	private ArrayList<InterfazEstupida> lr = null;
	private Vehiculo vSeat = null;
	private Vehiculo vFord = null;
	private Pajaro pKiwi = null;
	private Pajaro pGallina = null;

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

		lr = new ArrayList<InterfazEstupida>();
		vSeat = new Vehiculo("Seat");
		pKiwi = new Pajaro("Kiwi");
		vFord = new Vehiculo("Ford K");
		pGallina = new Pajaro("Gallina");
		vSeat.setPotencia(500);
		vFord.setPotencia(100);
		pKiwi.setHuevosSemana(2);
		pGallina.setHuevosSemana(700);
		lr.add(vSeat);
		lr.add(vFord);
		lr.add(pKiwi);
		lr.add(pGallina);

	}

	/**
	 * Metodo que se ejecuta despues de cada ejecucion de cada metodo del test
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		lr = null;
		vSeat = null;
		pKiwi = null;
		vFord = null;
		pGallina = null;

	}

	@Test
	public void ordenarPorPeso() {

		Collections.sort(lr, new ComparatorEstupido());
		assertEquals(pKiwi, lr.get(0));
		assertEquals(vFord, lr.get(1));
		assertEquals(vSeat, lr.get(2));
		assertEquals(pGallina, lr.get(3));
	}

}
