package com.ipartek.formacion.ejecicioDado.main;

import com.ipartek.formacion.ejecicioDado.pojo.Utilidades;

public class Dado {

	private static String [] aAlumnos={"Aaron","Eneko","Itsaso","Ivan","Guillermo","Lozoya","Josu","Ignacio","Gomez"
			,"Nerea","Nagore","Garbiñe","Egoitz","Pavel","Pérez","Raul"};
	
	public static void main(String[] args) {
		
		System.out.println("El/a afortunado es: ");
		
			System.out.println(aAlumnos[Utilidades.getnumeroAleatorio(aAlumnos.length-1)]);

			

	}
	
	public static int getNumAlumnos()
	{
		return aAlumnos.length;
	}
}
