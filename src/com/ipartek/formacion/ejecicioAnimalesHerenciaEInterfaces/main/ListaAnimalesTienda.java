package com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.main;

import java.util.ArrayList;

import com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.interfaz.IVendible;
import com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.pojo.Burro;
import com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.pojo.Pajaro;

/**
 * Lista de animales crear un array list de tipo Vendible-->Meter burros o
 * pajaros Ese arrayList tienes que sacar por pantalla las caracteristicas
 * Imprimir tipo animal precio .Si es comestible o no y si es volador o no
 * 
 * @author Curso
 *
 */
public class ListaAnimalesTienda {

	public static void main(String[] args) {

		ArrayList<IVendible> listVendible = new ArrayList<IVendible>();

		listVendible.add(new Burro("Burro mamut americano", "Mamifero", 1000f, "Julian"));
		listVendible.add(new Pajaro("Ninfa", "Mamifero", 250f, true));
		listVendible.add(new Pajaro("Gallina", "Oviparo", 2400f, false));
		Burro b = null;
		Pajaro p = null;
		System.out.println("LISTADO ANIMALES VENDIBLES");
		System.out.println("--------------------------\n");
		for (IVendible vendible : listVendible) {
			if (vendible instanceof Burro) {
				b = ((Burro) vendible);
				System.out.println(b.toString());
			} else if (vendible instanceof Pajaro) {
				p = ((Pajaro) vendible);
				System.out.println(p.toString());
			}
			else
			{
				System.out.println("****No sabemos que eres "+vendible.toString());
			}
		}
	}

}
