package com.ipartek.formacion.ejecicioReceta.pojo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaTest {

	private Receta recetaConIngredientes = null;
	private Receta recetaSinIngredientes = null;
	private ArrayList<Receta> lr = null;
	private Receta r2 =null;
	private Receta r3 = null;
	private Receta r4 =null;
	/**
	 * Metodo que se ejecuta antes del test
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	/**
	 * 	 * Metodo que se ejecuta despues del test
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Metodo que se ejecuta antes de cada ejecucion de cada metodo del test
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		ArrayList<Ingrediente> lIngredientes = new ArrayList<Ingrediente>();
		lIngredientes.add(new Ingrediente("Patatas", 4, false));
		recetaConIngredientes = new Receta("Marmitako de bonito", lIngredientes, -20,Receta.FACIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		recetaSinIngredientes = new Receta("Marmitako de bonito", null, -20, Receta.FACIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
	
		lr = new ArrayList<Receta>();
		r2 = new Receta("Solomillo");
		r3 = new Receta("Marmitako de bonito");
		r4 = new Receta("Atun");

		r2.setDificultad(Receta.MODERADO);
		r3.setDificultad(Receta.FACIL);
		r4.setDificultad(Receta.DIFICIL);
	}
	/**
	 * Metodo que se ejecuta despues de cada ejecucion de cada metodo del test
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		recetaSinIngredientes = null;
		recetaConIngredientes = null;
		lr=null;
		r2=null;
		r3=null;
		r4=null;
	}

	@Test
	public void cantidadNegativaTiempo() {

		assertEquals(0, recetaConIngredientes.getTiempo());

	}

	@Test
	public void noCreadoListaIngredientes() {
		assertNotNull(recetaSinIngredientes.getIngrediente());
	}

	@Test
	public void testConstructor() {
		assertNotNull(recetaConIngredientes.getIngrediente());
	}

	@Test
	public void glutenFree() {

		// Los dos elementos no contienen gluten
		recetaSinIngredientes.getIngrediente().clear();
		recetaSinIngredientes.setIngrediente(crearIngredientes(false, false));
		assertEquals("No", recetaSinIngredientes.getContieneGluten());

		// Un elemeto con gluten: Resultado esperado-->Si
		recetaSinIngredientes.getIngrediente().clear();
		recetaSinIngredientes.setIngrediente(crearIngredientes(true, false));
		assertEquals("Si", recetaSinIngredientes.getContieneGluten());

		// Los dos elemantos tienen gluten
		recetaSinIngredientes.getIngrediente().clear();
		recetaSinIngredientes.setIngrediente(crearIngredientes(true, true));
		recetaSinIngredientes.contieneGluten();
		assertEquals("Si", recetaSinIngredientes.getContieneGluten());

	}

	@Test
	public void addIngredienteReceta() {
		// Si se a�ade bien el elemento a la receta devuelve true
		Ingrediente i = new Ingrediente();
		assertTrue(recetaConIngredientes.addIngrediente(i));
		// Si el elemento es nulo devolver false
		assertFalse(recetaConIngredientes.addIngrediente(null));
	}

	@Test
	public void removeIngredienteReceta() {

		Ingrediente i = new Ingrediente("Patatas", 5, false);
		Ingrediente i2 = new Ingrediente("Salchicha", 5, false);

		recetaSinIngredientes.addIngrediente(i);
		recetaSinIngredientes.addIngrediente(new Ingrediente("Sal", false));
		recetaSinIngredientes.addIngrediente(new Ingrediente("Gindilla Cayena", 1, false));
		recetaSinIngredientes.addIngrediente(new Ingrediente("Patatas", 4, false));
		
		assertFalse(recetaSinIngredientes.contiene(null));
		assertTrue(recetaSinIngredientes.contiene(i));
		assertFalse(recetaSinIngredientes.contiene(i2));

		
		assertTrue(recetaSinIngredientes.removeIngrediente(i));
		assertTrue(recetaSinIngredientes.removeIngrediente("Sal"));
		assertFalse(recetaSinIngredientes.removeIngrediente("Peperoni"));
		assertFalse(recetaSinIngredientes.removeIngrediente(i2));
	}
	
	@Test
	public void testCompareTo() {
		// TODO Auto-generated method stub
		final String MSG_ERROR_TITULO="NO ORDENA POR TITULO";
		lr.add(r2);
		lr.add(r3);
		lr.add(r4);
		Collections.sort(lr, new Receta().getNuevoComparatorReceta());
		assertEquals(MSG_ERROR_TITULO,r4, lr.get(0));
		assertEquals(MSG_ERROR_TITULO,r3, lr.get(1));
		assertEquals(MSG_ERROR_TITULO,r2, lr.get(2));
	}
	
	@Test
	public void testCompare() {
		// TODO Auto-generated method stub
		final String MSG_ERROR_DIFICULTAD="NO ORDENA POR NIVEL DE DIFICULTAD";
		lr.add(r2);
		lr.add(r3);
		lr.add(r4);
		Collections.sort(lr);
		assertEquals(MSG_ERROR_DIFICULTAD,r3, lr.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD,r2, lr.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD,r4, lr.get(2));
	}

	


	private ArrayList<Ingrediente> crearIngredientes(boolean caso1, boolean caso2) {
		ArrayList<Ingrediente> lIngredientes = new ArrayList<Ingrediente>();
		lIngredientes.add(new Ingrediente("Patatas", 4, caso1));
		lIngredientes.add(new Ingrediente("Patatas", 4, caso2));
		return lIngredientes;
	}
	
	

}
