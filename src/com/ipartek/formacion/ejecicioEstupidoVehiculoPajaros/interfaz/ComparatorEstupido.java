package com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz;

import java.util.Comparator;

public class ComparatorEstupido implements Comparator<InterfazEstupida> {
	
	@Override
	/**
	 * Metodo que compara dos recetas. No tiene sensibilidad a mayuscular y
	 * minusculas. (tortilla=TORTILLA)
	 */
	public int compare(InterfazEstupida o1, InterfazEstupida o2) {
		return o1.getPeso()-o2.getPeso();
	}
	
}