package com.ipartek.formacion.ejecicioAnimalesHerenciaEInterfaces.interfaz;

public interface IConducible {

	final String DERECHA="derecha";
	
	final String IZQUIERDA="izquierda";
	
	public void arrancar();
	
	public void detener();
	
	public void girar(String direccion);

}
