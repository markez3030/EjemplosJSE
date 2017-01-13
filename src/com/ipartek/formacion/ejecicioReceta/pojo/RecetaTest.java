package com.ipartek.formacion.ejecicioReceta.pojo;


import static org.junit.Assert.*;
import org.junit.Test;

public class RecetaTest {


	@Test
	public void cantidadNegativaTiempo() {
		Receta r= new Receta("Marmitako de bonito", -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals(0, r.getTiempo());
	}
	
	@Test
	public void nohayIngredientes()
	{
		Receta r= new Receta("Marmitako de bonito", -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals(null, r.getIngrediente());
	}

}
