package com.ipartek.formacion.ejecicioReceta.main;

import java.util.ArrayList;

import com.ipartek.formacion.ejecicioReceta.pojo.Ingrediente;
import com.ipartek.formacion.ejecicioReceta.pojo.Receta;

public class MarmitacoReceta {

	
	public static void main(String[] args) {
		
		ArrayList<Ingrediente> hashIngredientes= new  ArrayList<Ingrediente>();
		hashIngredientes.add(new Ingrediente("Patatas" , 4 ,false));
		hashIngredientes.add(new Ingrediente("Bonito limpio" , 500  ,false));
		hashIngredientes.add(new Ingrediente("Cebolletas" , 2 ,false));
		hashIngredientes.add(new Ingrediente("Pimiento Verde" , 2 ,false));
		hashIngredientes.add(new Ingrediente("Pimiento Rojo" , 1 ,false));
		hashIngredientes.add(new Ingrediente("Cabeza de ajo" , 1 ,false));
		hashIngredientes.add(new Ingrediente("Pimiento Choricero" , 4 ,false));
		hashIngredientes.add(new Ingrediente("Pan de sopa" , 40 ,false));
		hashIngredientes.add(new Ingrediente("Salsa de tomate" , 1 ,false));
		hashIngredientes.add(new Ingrediente("Agua" ,false));
		hashIngredientes.add(new Ingrediente("Brandy" , 1 ,false));
		hashIngredientes.add(new Ingrediente("Aceite de oliva" ,false));
		hashIngredientes.add(new Ingrediente("Sal" ,false));
		hashIngredientes.add(new Ingrediente("Pimienta" ,false));
		hashIngredientes.add(new Ingrediente("Gindilla Cayena", 1 ,false));
		hashIngredientes.add(new Ingrediente("Perejil" ,false));
		Receta r= new Receta("Marmitako de bonito", hashIngredientes, 30, "Sencilla", "4-6 personas", "Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		System.out.println(r.toString());

		
	
	}
}
