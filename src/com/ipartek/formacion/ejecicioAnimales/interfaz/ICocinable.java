package com.ipartek.formacion.ejecicioAnimales.interfaz;

import java.util.ArrayList;

import com.ipartek.formacion.ejecicioReceta.pojo.Ingrediente;

public interface ICocinable {

		
	public ArrayList<Ingrediente> getIngredientes();
	
	public String getDescripcionReceta();
}
