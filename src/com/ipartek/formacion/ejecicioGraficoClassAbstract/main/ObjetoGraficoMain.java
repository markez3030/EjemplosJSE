package com.ipartek.formacion.ejecicioGraficoClassAbstract.main;

import com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo.LineaColor;
import com.ipartek.formacion.ejecicioGraficoClassAbstract.pojo.ObjetoGrafico;

public class ObjetoGraficoMain {

	/**
	 * Comprobar que solo podemos instanciar obj3etos de las Clases que no sean
	 * abstractas
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * Nueva forma de crear un objeto a partir de JAVA SE7
		 * A la pregunta se puede crear objetos de una clase abstracta la
		 * respuesta es no
		 * 
		 * ESTO ES LO QUE SE DENOMINA UNA CLASE ANONIMA
		 * --------------------------------------------
		 * UN OBJETO QUE ES CREADO AL VUELO		 
		 * */

		ObjetoGrafico og = new ObjetoGrafico(0, 0) {
			@Override
			public void dibujar() {
				// TODO Auto-generated method stub
				System.out.println("Objeto grafico");
			}
		};
		og.dibujar();

		LineaColor lc = new LineaColor(0, 0, 0, "Blue");
		lc.dibujar();

	}
}
