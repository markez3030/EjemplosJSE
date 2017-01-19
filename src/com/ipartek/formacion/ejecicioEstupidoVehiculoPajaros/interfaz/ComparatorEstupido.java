package com.ipartek.formacion.ejecicioEstupidoVehiculoPajaros.interfaz;

import java.util.Comparator;

public class ComparatorEstupido implements Comparator<InterfazEstupido> {
	
	@Override
	/**
	 * Metodo que compara dos recetas. No tiene sensibilidad a mayuscular y
	 * minusculas. (tortilla=TORTILLA)
	 */
	public int compare(InterfazEstupido o1, InterfazEstupido o2) {
		return o1.getPeso()-o2.getPeso();
	}
	
}