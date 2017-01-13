package com.ipartek.formacion.ejecicioReceta.pojo;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RecetaTest {


	@Test
	public void cantidadNegativaTiempo() {
		ArrayList<Ingrediente> lIngredientes= new  ArrayList<Ingrediente>();
		lIngredientes.add(new Ingrediente("Patatas" , 4 ,false));
		Receta r= new Receta("Marmitako de bonito",lIngredientes, -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals(0, r.getTiempo());
	
	}
	
	
	@Test
	public void nohayIngredientes()
	{
		Receta r= new Receta("Marmitako de bonito", -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals(null, r.getIngrediente());
	}
	
	@Test
	public void glutenFree()
	{
		//Un elemeto con gluten: Resultado esperado-->Si
		Receta r= new Receta("Marmitako de bonito",crearIngredientes(true, false), -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals("Si", r.getContieneGluten());
		
		//Los dos elemantos tienen gluten
		r= new Receta("Marmitako de bonito",crearIngredientes(true, true), -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals("Si", r.getContieneGluten());
		
		//Los dos elementos no contienen gluten
		r= new Receta("Marmitako de bonito",crearIngredientes(false, false), -20, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		assertEquals("No",r.getContieneGluten());
		
		
	}
	
	
	private ArrayList<Ingrediente> crearIngredientes(boolean caso1,boolean caso2)
	{
		ArrayList<Ingrediente> lIngredientes= new  ArrayList<Ingrediente>();
		lIngredientes.add(new Ingrediente("Patatas" , 4 ,caso1));
		lIngredientes.add(new Ingrediente("Patatas" , 4 ,caso2));
		return lIngredientes;
	}

}
