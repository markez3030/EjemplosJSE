package com.ipartek.formacion.ejecicioReceta.main;

import java.util.ArrayList;
import java.util.Collections;

import com.ipartek.formacion.ejecicioReceta.pojo.Ingrediente;
import com.ipartek.formacion.ejecicioReceta.pojo.Receta;

public class MarmitacoReceta {

	public static void main(String[] args) {

		ArrayList<Ingrediente> lIngredientes = new ArrayList<Ingrediente>();
		lIngredientes.add(new Ingrediente("Patatas", 4, false));
		lIngredientes.add(new Ingrediente("Bonito limpio", 500, false));
		lIngredientes.add(new Ingrediente("Cebolletas", 2, false));
		lIngredientes.add(new Ingrediente("Pimiento Verde", 2, false));
		lIngredientes.add(new Ingrediente("Pimiento Rojo", 1, false));
		lIngredientes.add(new Ingrediente("Cabeza de ajo", 1, false));
		lIngredientes.add(new Ingrediente("Pimiento Choricero", 4, false));
		lIngredientes.add(new Ingrediente("Pan de sopa", 40, true));
		lIngredientes.add(new Ingrediente("Salsa de tomate", 1, false));
		lIngredientes.add(new Ingrediente("Agua", false));
		lIngredientes.add(new Ingrediente("Brandy", 1, false));
		lIngredientes.add(new Ingrediente("Aceite de oliva", false));
		lIngredientes.add(new Ingrediente("Sal", false));
		lIngredientes.add(new Ingrediente("Pimienta", false));
		lIngredientes.add(new Ingrediente("Gindilla Cayena", 1, false));
		lIngredientes.add(new Ingrediente("Perejil", false));
		Receta r = new Receta("Marmitako de bonito", lIngredientes, 30, Receta.FACIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		System.out.println(r.toString());

		System.out.println("\n\n\n\n\n\n\nRECETAAAAAAAAAAAAAAAAAAA2222222");
		r = new Receta("PASTEL DE CARNEEEE", 30, Receta.FACIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		Ingrediente i = new Ingrediente("Patatas", 5, false);
		r.addIngrediente(i);
		r.addIngrediente(new Ingrediente("Sal", false));
		r.addIngrediente(new Ingrediente("Gindilla Cayena", 1, false));
		r.addIngrediente(new Ingrediente("Patatas", 4, false));
		System.out.println(r.toString());
		System.out.println("\n\n\n\nQUITAMOS LA SAL POR NOMBRE");
		r.removeIngrediente("SAL");
		System.out.println(r.toString());
		System.out.println("\n\n\n\nQUITAMOS LA PATATA POR OBJETO");
		r.removeIngrediente(i);
		System.out.println(r.toString());

		ArrayList<Receta> lr = new ArrayList<Receta>();
		Receta r2 = new Receta("Solomillo", lIngredientes, 30, Receta.MODERADO, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		Receta r3 = new Receta("Marmitako de bonito", lIngredientes, 30, Receta.DIFICIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");
		Receta r4 = new Receta("Atun", lIngredientes, 30, Receta.FACIL, "4-6 personas",
				"Retira el rabo y las pepitas a los pimientos choriceros y ponlos a hidratar en un cuenco con agua caliente.");

		lr.add(r2);
		lr.add(r3);
		lr.add(r4);
		Collections.sort(lr, new Receta().getNuevoComparatorReceta());
		System.out.println("ORDENAR ALFABETICAMENTE\n-----------------\n");
		for (Receta r0 : lr) {
			System.out.println(r0.getTitulo());
		}

		System.out.println("\nORDENAR DIFICULTAD\n-----------------\n");
		Collections.sort(lr);

		for (Receta r0 : lr) {
			System.out.println(r0.getTitulo());
			System.out.println(r0.getDificultad() + "\n");
		}

	}
}
